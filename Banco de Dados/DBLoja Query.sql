-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema dbloja
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema dbloja
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `dbloja` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `dbloja` ;

-- -----------------------------------------------------
-- Table `dbloja`.`Pessoa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbloja`.`Pessoa` (
  `idPessoa` BIGINT NOT NULL AUTO_INCREMENT,
  `tipoPessoa` VARCHAR(20) NULL,
  `criacaoPessoa` DATETIME NULL,
  `atualizacaoPessoa` DATETIME NULL,
  PRIMARY KEY (`idPessoa`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbloja`.`Contato`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbloja`.`Contato` (
  `idContato` BIGINT NOT NULL AUTO_INCREMENT,
  `nomeContato` VARCHAR(50) NULL,
  `emailContato` VARCHAR(30) NULL,
  `telefoneContato` VARCHAR(20) NULL,
  `celularContato` VARCHAR(20) NULL,
  `criacaoContato` DATETIME NULL,
  `atualizacaoContato` DATETIME NULL,
  PRIMARY KEY (`idContato`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbloja`.`Endereco`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbloja`.`Endereco` (
  `idEndereco` BIGINT NOT NULL AUTO_INCREMENT,
  `enderecoEndereco` VARCHAR(50) NULL,
  `cepEndereco` VARCHAR(10) NULL,
  `complementoEndereco` VARCHAR(20) NULL,
  `numeroEndereco` VARCHAR(10) NULL,
  `cidadeEndereco` VARCHAR(20) NULL,
  `bairroEndereco` VARCHAR(20) NULL,
  `estadoEndereco` VARCHAR(20) NULL,
  `criacaoEndereco` DATETIME NULL,
  `atualizacaoEndereco` DATETIME NULL,
  PRIMARY KEY (`idEndereco`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbloja`.`Funcionario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbloja`.`Funcionario` (
  `idFuncionario` BIGINT NOT NULL AUTO_INCREMENT,
  `pessoaFuncionario` BIGINT NULL,
  `contatoFuncionario` BIGINT NULL,
  `enderecoFuncionario` BIGINT NULL,
  `nomeFuncionario` VARCHAR(50) NULL,
  `cargoFuncionario` VARCHAR(20) NULL,
  `usuarioFuncionario` VARCHAR(30) NULL,
  `senhaFuncionario` VARCHAR(30) NULL,
  `criacaoFuncionario` DATETIME NULL,
  `atualizacaoFuncionario` DATETIME NULL,
  PRIMARY KEY (`idFuncionario`),
  INDEX `fk_Funcionario_Pessoa1_idx` (`pessoaFuncionario` ASC),
  INDEX `fk_Funcionario_Contato1_idx` (`contatoFuncionario` ASC),
  INDEX `fk_Funcionario_Endereco1_idx` (`enderecoFuncionario` ASC),
  CONSTRAINT `fk_Funcionario_Pessoa1`
    FOREIGN KEY (`pessoaFuncionario`)
    REFERENCES `dbloja`.`Pessoa` (`idPessoa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Funcionario_Contato1`
    FOREIGN KEY (`contatoFuncionario`)
    REFERENCES `dbloja`.`Contato` (`idContato`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Funcionario_Endereco1`
    FOREIGN KEY (`enderecoFuncionario`)
    REFERENCES `dbloja`.`Endereco` (`idEndereco`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbloja`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbloja`.`Cliente` (
  `idCliente` BIGINT NOT NULL AUTO_INCREMENT,
  `pessoaCliente` BIGINT NULL,
  `contatoCliente` BIGINT NULL,
  `enderecoCliente` BIGINT NULL,
  `nomeCliente` VARCHAR(50) NULL,
  `salarioCliente` DECIMAL(10,2) NULL,
  `limiteCliente` DECIMAL(10,2) NULL,
  `descontoCliente` DECIMAL(10,2) NULL,
  `criacaoCliente` DATETIME NULL,
  `atualizacaoCliente` DATETIME NULL,
  PRIMARY KEY (`idCliente`),
  INDEX `fk_Cliente_Pessoa1_idx` (`pessoaCliente` ASC),
  INDEX `fk_Cliente_Contato1_idx` (`contatoCliente` ASC),
  INDEX `fk_Cliente_Endereco1_idx` (`enderecoCliente` ASC),
  CONSTRAINT `fk_Cliente_Pessoa1`
    FOREIGN KEY (`pessoaCliente`)
    REFERENCES `dbloja`.`Pessoa` (`idPessoa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Cliente_Contato1`
    FOREIGN KEY (`contatoCliente`)
    REFERENCES `dbloja`.`Contato` (`idContato`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Cliente_Endereco1`
    FOREIGN KEY (`enderecoCliente`)
    REFERENCES `dbloja`.`Endereco` (`idEndereco`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbloja`.`Fornecedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbloja`.`Fornecedor` (
  `idFornecedor` BIGINT NOT NULL AUTO_INCREMENT,
  `pessoaFornecedor` BIGINT NULL,
  `contatoFornecedor` BIGINT NULL,
  `enderecoFornecedor` BIGINT NULL,
  `nomeFornecedor` VARCHAR(50) NULL,
  `criacaoFornecedor` DATETIME NULL,
  `atualizacaoFornecedor` DATETIME NULL,
  PRIMARY KEY (`idFornecedor`),
  INDEX `fk_Fornecedor_Pessoa1_idx` (`pessoaFornecedor` ASC),
  INDEX `fk_Fornecedor_Contato1_idx` (`contatoFornecedor` ASC),
  INDEX `fk_Fornecedor_Endereco1_idx` (`enderecoFornecedor` ASC),
  CONSTRAINT `fk_Fornecedor_Pessoa1`
    FOREIGN KEY (`pessoaFornecedor`)
    REFERENCES `dbloja`.`Pessoa` (`idPessoa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Fornecedor_Contato1`
    FOREIGN KEY (`contatoFornecedor`)
    REFERENCES `dbloja`.`Contato` (`idContato`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Fornecedor_Endereco1`
    FOREIGN KEY (`enderecoFornecedor`)
    REFERENCES `dbloja`.`Endereco` (`idEndereco`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbloja`.`Categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbloja`.`Categoria` (
  `idCategoria` BIGINT NOT NULL AUTO_INCREMENT,
  `descricaoCategoria` VARCHAR(50) NULL,
  `criacaoCategoria` DATETIME NULL,
  `atualizacaoCategoria` DATETIME NULL,
  PRIMARY KEY (`idCategoria`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbloja`.`Produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbloja`.`Produto` (
  `idProduto` BIGINT NOT NULL AUTO_INCREMENT,
  `categoriaProduto` BIGINT NULL,
  `fornecedorProduto` BIGINT NULL,
  `descricaoProduto` VARCHAR(50) NULL,
  `codigoProduto` VARCHAR(20) NULL,
  `custoProduto` DECIMAL(10,2) NULL,
  `vendaProduto` DECIMAL(10,2) NULL,
  `minimoProduto` BIGINT NULL,
  `maximoProduto` BIGINT NULL,
  `estoqueProduto` BIGINT NULL,
  `criacaoProduto` DATETIME NULL,
  `atualizacaoProduto` DATETIME NULL,
  PRIMARY KEY (`idProduto`),
  INDEX `fk_Produto_Categoria_idx` (`categoriaProduto` ASC),
  INDEX `fk_Produto_Fornecedor1_idx` (`fornecedorProduto` ASC),
  CONSTRAINT `fk_Produto_Categoria`
    FOREIGN KEY (`categoriaProduto`)
    REFERENCES `dbloja`.`Categoria` (`idCategoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Produto_Fornecedor1`
    FOREIGN KEY (`fornecedorProduto`)
    REFERENCES `dbloja`.`Fornecedor` (`idFornecedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbloja`.`PessoaFisica`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbloja`.`PessoaFisica` (
  `idPessoaFisica` BIGINT NOT NULL AUTO_INCREMENT,
  `pessoaPessoaFisica` BIGINT NULL,
  `cpfPessoaFisica` VARCHAR(20) NULL,
  `rgPessoaFisica` VARCHAR(20) NULL,
  `nascimentoPessoaFisica` DATE NULL,
  `criacaoPessoaFisica` DATETIME NULL,
  `atualizacaoPessoaFisica` DATETIME NULL,
  PRIMARY KEY (`idPessoaFisica`),
  INDEX `fk_PessoaFisica_Pessoa1_idx` (`pessoaPessoaFisica` ASC),
  CONSTRAINT `fk_PessoaFisica_Pessoa1`
    FOREIGN KEY (`pessoaPessoaFisica`)
    REFERENCES `dbloja`.`Pessoa` (`idPessoa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbloja`.`PessoaJuridica`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbloja`.`PessoaJuridica` (
  `idPessoaJuridica` BIGINT NOT NULL AUTO_INCREMENT,
  `pessoaPessoaJuridica` BIGINT NULL,
  `razaoSocialPessoaJuridica` VARCHAR(50) NULL,
  `nomeFantasiaPessoaJuridica` VARCHAR(50) NULL,
  `cnpjPessoaJuridica` VARCHAR(20) NULL,
  `estadualPessoaJuridica` VARCHAR(20) NULL,
  `municipalPessoaJuridica` VARCHAR(20) NULL,
  `suframaPessoaJuridica` VARCHAR(20) NULL,
  `tributoSimplesPessoaJuridica` TINYINT(1) NULL,
  `importacaoPessoaJuridica` TINYINT(1) NULL,
  `icmsPessoaJuridica` TINYINT(1) NULL,
  `fundacaoPessoaJuridica` DATE NULL,
  `criacaoPessoaJuridica` DATETIME NULL,
  `atualizacaoPessoaJuridica` DATETIME NULL,
  PRIMARY KEY (`idPessoaJuridica`),
  INDEX `fk_PessoaJuridica_Pessoa1_idx` (`pessoaPessoaJuridica` ASC),
  CONSTRAINT `fk_PessoaJuridica_Pessoa1`
    FOREIGN KEY (`pessoaPessoaJuridica`)
    REFERENCES `dbloja`.`Pessoa` (`idPessoa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbloja`.`Compra`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbloja`.`Compra` (
  `idCompra` BIGINT NOT NULL AUTO_INCREMENT,
  `funcionarioCompra` BIGINT NULL,
  `fornecedorCompra` BIGINT NULL,
  `valorCompra` DECIMAL(10,2) NULL,
  `parcelasCompra` INT NULL,
  `vencimentoCompra` DATE NULL,
  `criacaoCompra` DATETIME NULL,
  `atualizacaoCompra` DATETIME NULL,
  PRIMARY KEY (`idCompra`),
  INDEX `fk_Compra_Fornecedor1_idx` (`fornecedorCompra` ASC),
  INDEX `fk_Compra_Funcionario1_idx` (`funcionarioCompra` ASC),
  CONSTRAINT `fk_Compra_Fornecedor1`
    FOREIGN KEY (`fornecedorCompra`)
    REFERENCES `dbloja`.`Fornecedor` (`idFornecedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Compra_Funcionario1`
    FOREIGN KEY (`funcionarioCompra`)
    REFERENCES `dbloja`.`Funcionario` (`idFuncionario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbloja`.`ItemCompra`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbloja`.`ItemCompra` (
  `idItemCompra` BIGINT NOT NULL AUTO_INCREMENT,
  `compraItemCompra` BIGINT NULL,
  `produtoItemCompra` BIGINT NULL,
  `quantidadeItemCompra` INT NULL,
  `valorItemCompra` DECIMAL(10,2) NULL,
  `criacaoItemCompra` DATETIME NULL,
  `atualizacaoItemCompra` DATETIME NULL,
  PRIMARY KEY (`idItemCompra`),
  INDEX `fk_Item_Produto1_idx` (`produtoItemCompra` ASC),
  INDEX `fk_ItemCompra_Compra1_idx` (`compraItemCompra` ASC),
  CONSTRAINT `fk_Item_Produto1`
    FOREIGN KEY (`produtoItemCompra`)
    REFERENCES `dbloja`.`Produto` (`idProduto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ItemCompra_Compra1`
    FOREIGN KEY (`compraItemCompra`)
    REFERENCES `dbloja`.`Compra` (`idCompra`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbloja`.`Venda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbloja`.`Venda` (
  `idVenda` BIGINT NOT NULL AUTO_INCREMENT,
  `funcionarioVenda` BIGINT NULL,
  `clienteVenda` BIGINT NULL,
  `valorVenda` DECIMAL(10,2) NULL,
  `parcelasVenda` INT NULL,
  `vencimentoVenda` DATE NULL,
  `criacaoVenda` DATETIME NULL,
  `atualizacaoVenda` DATETIME NULL,
  PRIMARY KEY (`idVenda`),
  INDEX `fk_Venda_Cliente1_idx` (`clienteVenda` ASC),
  INDEX `fk_Venda_Funcionario1_idx` (`funcionarioVenda` ASC),
  CONSTRAINT `fk_Venda_Cliente1`
    FOREIGN KEY (`clienteVenda`)
    REFERENCES `dbloja`.`Cliente` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Venda_Funcionario1`
    FOREIGN KEY (`funcionarioVenda`)
    REFERENCES `dbloja`.`Funcionario` (`idFuncionario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbloja`.`Lancamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbloja`.`Lancamento` (
  `idLancamento` BIGINT NOT NULL AUTO_INCREMENT,
  `tipoLancamento` VARCHAR(50) NULL,
  `criacaoLancamento` DATETIME NULL,
  `atualizacaLancamento` DATETIME NULL,
  PRIMARY KEY (`idLancamento`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbloja`.`Pagamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbloja`.`Pagamento` (
  `idPagamento` BIGINT NOT NULL AUTO_INCREMENT,
  `funcionarioPagamento` BIGINT NULL,
  `lancamentoPagamento` BIGINT NULL,
  `compraPagamento` BIGINT NULL,
  `descricaoPagamento` VARCHAR(50) NULL,
  `valorPagamento` DECIMAL(10,2) NULL,
  `dataPagamento` DATE NULL,
  `statusPagamento` TINYINT(1) NULL,
  `criacaoPagamento` DATETIME NULL,
  `atualizacaoPagamento` DATETIME NULL,
  PRIMARY KEY (`idPagamento`),
  INDEX `fk_Pagamento_Compra1_idx` (`compraPagamento` ASC),
  INDEX `fk_Pagamento_Funcionario1_idx` (`funcionarioPagamento` ASC),
  INDEX `fk_Pagamento_Lancamento1_idx` (`lancamentoPagamento` ASC),
  CONSTRAINT `fk_Pagamento_Compra1`
    FOREIGN KEY (`compraPagamento`)
    REFERENCES `dbloja`.`Compra` (`idCompra`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Pagamento_Funcionario1`
    FOREIGN KEY (`funcionarioPagamento`)
    REFERENCES `dbloja`.`Funcionario` (`idFuncionario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Pagamento_Lancamento1`
    FOREIGN KEY (`lancamentoPagamento`)
    REFERENCES `dbloja`.`Lancamento` (`idLancamento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbloja`.`Recebimento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbloja`.`Recebimento` (
  `idRecebimento` BIGINT NOT NULL AUTO_INCREMENT,
  `funcionarioRecebimento` BIGINT NULL,
  `lancamentoRecebimento` BIGINT NULL,
  `vendaRecebimento` BIGINT NULL,
  `descricaoRecebimento` VARCHAR(50) NULL,
  `valorRecebimento` DECIMAL(10,2) NULL,
  `dataRecebimento` DATE NULL,
  `statusRecebimento` TINYINT(1) NULL,
  `criacaoRecebimento` DATETIME NULL,
  `atualizacaoRecebimento` DATETIME NULL,
  PRIMARY KEY (`idRecebimento`),
  INDEX `fk_Recebimento_Venda1_idx` (`vendaRecebimento` ASC),
  INDEX `fk_Recebimento_Funcionario1_idx` (`funcionarioRecebimento` ASC),
  INDEX `fk_Recebimento_Lancamento1_idx` (`lancamentoRecebimento` ASC),
  CONSTRAINT `fk_Recebimento_Venda1`
    FOREIGN KEY (`vendaRecebimento`)
    REFERENCES `dbloja`.`Venda` (`idVenda`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Recebimento_Funcionario1`
    FOREIGN KEY (`funcionarioRecebimento`)
    REFERENCES `dbloja`.`Funcionario` (`idFuncionario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Recebimento_Lancamento1`
    FOREIGN KEY (`lancamentoRecebimento`)
    REFERENCES `dbloja`.`Lancamento` (`idLancamento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbloja`.`Extrato`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbloja`.`Extrato` (
  `idExtrato` BIGINT NOT NULL AUTO_INCREMENT,
  `lancamentoExtrato` BIGINT NULL,
  `valorExtarto` DECIMAL(10,2) NULL,
  `saldoExtrato` DECIMAL(10,2) NULL,
  `criacaoExtrato` DATETIME NULL,
  `atualizacaoExtrato` DATETIME NULL,
  PRIMARY KEY (`idExtrato`),
  INDEX `fk_Extrato_Lancamento1_idx` (`lancamentoExtrato` ASC),
  CONSTRAINT `fk_Extrato_Lancamento1`
    FOREIGN KEY (`lancamentoExtrato`)
    REFERENCES `dbloja`.`Lancamento` (`idLancamento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dbloja`.`ItemVenda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbloja`.`ItemVenda` (
  `idItemVenda` BIGINT NOT NULL AUTO_INCREMENT,
  `vendaItemVenda` BIGINT NULL,
  `produtoItemVenda` BIGINT NULL,
  `quantidadeItemVenda` INT NULL,
  `valorItemVenda` DECIMAL(10,2) NULL,
  `criacaoItemVenda` DATETIME NULL,
  `atualizacaoItemVenda` DATETIME NULL,
  PRIMARY KEY (`idItemVenda`),
  INDEX `fk_Item_Produto1_idx` (`produtoItemVenda` ASC),
  INDEX `fk_ItemCompra_copy1_Venda1_idx` (`vendaItemVenda` ASC),
  CONSTRAINT `fk_Item_Produto10`
    FOREIGN KEY (`produtoItemVenda`)
    REFERENCES `dbloja`.`Produto` (`idProduto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ItemCompra_copy1_Venda1`
    FOREIGN KEY (`vendaItemVenda`)
    REFERENCES `dbloja`.`Venda` (`idVenda`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- INSERT INTO
-- -----------------------------------------------------
INSERT INTO `dbloja`.`endereco` (`idEndereco`, `enderecoEndereco`, `cepEndereco`, `complementoEndereco`, `numeroEndereco`, `cidadeEndereco`, `bairroEndereco`, `estadoEndereco`, `criacaoEndereco`, `atualizacaoEndereco`) VALUES ('1', 'rua Lourival Balbuino do Carmo', '38057-400', 'casa', '49', 'Uberaba', 'Tutunas', 'Minas Gerais', '2015.06.21', '2015.06.21');
INSERT INTO `dbloja`.`contato` (`idContato`, `nomeContato`, `emailContato`, `telefoneContato`, `celularContato`, `criacaoContato`, `atualizacaoContato`) VALUES ('1', 'Márlon Andrel Coelho Freitas', 'marlonmacf@gmail.com', '(34)3322-9812', '(34)9175-313', '2015.06.21', '2015.06.21');
INSERT INTO `dbloja`.`pessoa` (`idPessoa`, `tipoPessoa`, `criacaoPessoa`, `atualizacaoPessoa`) VALUES ('1', 'Fisica', '2015.06.21', '2015.06.21');
INSERT INTO `dbloja`.`pessoafisica` (`idPessoaFisica`, `pessoaPessoaFisica`, `cpfPessoaFisica`, `rgPessoaFisica`, `nascimentoPessoaFisica`, `criacaoPessoaFisica`, `atualizacaoPessoaFisica`) VALUES ('1', '1', '000.000.000-00', 'MG00000000', '1994.06.21', '2015.06.21', '2015.06.21');
INSERT INTO `dbloja`.`funcionario` (`idFuncionario`, `pessoaFuncionario`, `contatoFuncionario`, `enderecoFuncionario`, `nomeFuncionario`, `cargoFuncionario`, `usuarioFuncionario`, `senhaFuncionario`, `criacaoFuncionario`, `atualizacaoFuncionario`) VALUES ('1', '1', '1', '1', 'Marlon Andrel', 'Desenvolvedor', 'marlonmacf', '1234567890', '2015.06.21', '2015.06.21');

INSERT INTO `dbloja`.`pessoa` (`idPessoa`, `tipoPessoa`, `criacaoPessoa`, `atualizacaoPessoa`) VALUES ('2', 'Fisica', '2015.06.21', '2015.06.21');
INSERT INTO `dbloja`.`pessoafisica` (`idPessoaFisica`, `pessoaPessoaFisica`, `cpfPessoaFisica`, `rgPessoaFisica`, `nascimentoPessoaFisica`, `criacaoPessoaFisica`, `atualizacaoPessoaFisica`) VALUES ('2', '2', '000.000.000-00', 'MG00000000', '2015.06.21', '2015.06.21', '2015.06.21');
INSERT INTO `dbloja`.`contato` (`idContato`, `nomeContato`, `emailContato`, `telefoneContato`, `celularContato`, `criacaoContato`, `atualizacaoContato`) VALUES ('2', 'João da Silva', 'joao@gmail.com', '(00)0000-0000', '(00)0000-0000', '2015.06.21', '2015.06.21');
INSERT INTO `dbloja`.`endereco` (`idEndereco`, `enderecoEndereco`, `cepEndereco`, `complementoEndereco`, `numeroEndereco`, `cidadeEndereco`, `bairroEndereco`, `estadoEndereco`, `criacaoEndereco`, `atualizacaoEndereco`) VALUES ('2', 'rua Dujão Silva', '00000-000', 'casa', '10', 'Uberaba', 'Centro', 'Minas Gerais', '2015.06.21', '2015.06.21');
INSERT INTO `dbloja`.`cliente` (`idCliente`, `pessoaCliente`, `contatoCliente`, `enderecoCliente`, `nomeCliente`, `salarioCliente`, `limiteCliente`, `descontoCliente`, `criacaoCliente`, `atualizacaoCliente`) VALUES ('1', '2', '2', '2', 'João Silva', '900.00', '500.00', '5', '2015.06.21', '2015.06.21');

INSERT INTO `dbloja`.`pessoa` (`idPessoa`, `tipoPessoa`, `criacaoPessoa`, `atualizacaoPessoa`) VALUES ('3', 'Juridica', '2015.06.21', '2015.06.21');
INSERT INTO `dbloja`.`pessoajuridica` (`idPessoaJuridica`, `pessoaPessoaJuridica`, `razaoSocialPessoaJuridica`, `nomeFantasiaPessoaJuridica`, `cnpjPessoaJuridica`, `estadualPessoaJuridica`, `municipalPessoaJuridica`, `suframaPessoaJuridica`, `tributoSimplesPessoaJuridica`, `importacaoPessoaJuridica`, `icmsPessoaJuridica`, `fundacaoPessoaJuridica`, `criacaoPessoaJuridica`, `atualizacaoPessoaJuridica`) VALUES ('1', '3', 'maria da silva compania limitada', 'Maria\'s  Bar', '00.000.000/0000-00', '000.000.000.000', '000000000', '000000000', '1', '1', '1', '2015.06.21', '2015.06.21', '2015.06.21');
INSERT INTO `dbloja`.`endereco` (`idEndereco`, `enderecoEndereco`, `cepEndereco`, `complementoEndereco`, `numeroEndereco`, `cidadeEndereco`, `bairroEndereco`, `estadoEndereco`, `criacaoEndereco`, `atualizacaoEndereco`) VALUES ('3', 'rua Damaria Dasilva', '00000-000', 'casa', '55', 'Uberaba', 'Centro', 'Minas Gerais', '2015.06.21', '2015.06.21');
INSERT INTO `dbloja`.`contato` (`idContato`, `nomeContato`, `emailContato`, `telefoneContato`, `celularContato`, `criacaoContato`, `atualizacaoContato`) VALUES ('3', 'Maria da Silva', 'maria@gmail.com', '(00)0000-0000', '(00)0000-0000', '2015.06.21', '2015.06.21');
INSERT INTO `dbloja`.`fornecedor` (`idFornecedor`, `pessoaFornecedor`, `contatoFornecedor`, `enderecoFornecedor`, `nomeFornecedor`, `criacaoFornecedor`, `atualizacaoFornecedor`) VALUES ('1', '3', '3', '3', 'Maria\'s Bar', '2015.06.21', '2015.06.21');

INSERT INTO `dbloja`.`categoria` (`idCategoria`, `descricaoCategoria`, `criacaoCategoria`, `atualizacaoCategoria`) VALUES ('1', 'Caderno', '2015.06.21', '2015.06.21');

INSERT INTO `dbloja`.`produto` (`idProduto`, `categoriaProduto`, `fornecedorProduto`, `descricaoProduto`, `codigoProduto`, `custoProduto`, `vendaProduto`, `minimoProduto`, `maximoProduto`, `estoqueProduto`, `criacaoProduto`, `atualizacaoProduto`) VALUES ('1', '1', '1', 'Caderno Tilibra', '00000000000000000000', '5.00', '8.00', '20', '200', '135', '2015.06.21', '2015.06.21');

-- -----------------------------------------------------
-- SELECT *
-- -----------------------------------------------------
SELECT * FROM produto
