-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: 13-Jun-2019 às 17:38
-- Versão do servidor: 10.3.14-MariaDB
-- versão do PHP: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `id7693065_user`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `comments`
--

CREATE TABLE `comments` (
  `id` int(11) NOT NULL,
  `name` text COLLATE utf32_unicode_ci NOT NULL,
  `comment` text COLLATE utf32_unicode_ci NOT NULL,
  `post_time` text COLLATE utf32_unicode_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf32 COLLATE=utf32_unicode_ci;

--
-- Extraindo dados da tabela `comments`
--

INSERT INTO `comments` (`id`, `name`, `comment`, `post_time`) VALUES
(12, 'Matheus Santos', 'Muito bom.', '2018-12-04 23:30:36'),
(20, 'Raíssa Vilela', 'Ótimos profissionais, recomendo essa aplicação.', '2018-12-05 20:29:07'),
(21, 'Anna', 'Top.', '2018-12-06 19:02:57');

-- --------------------------------------------------------

--
-- Estrutura da tabela `imagens`
--

CREATE TABLE `imagens` (
  `id` int(11) NOT NULL,
  `user` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `nome` varchar(220) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(220) COLLATE utf8_unicode_ci NOT NULL,
  `senha` varchar(55) COLLATE utf8_unicode_ci NOT NULL,
  `imagens` varchar(220) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `imagens`
--

INSERT INTO `imagens` (`id`, `user`, `nome`, `email`, `senha`, `imagens`) VALUES
(1, 'x', 'xxx', 'matheusip3024@gmail.com', 'admin', 'letraE_seq2.png');

-- --------------------------------------------------------

--
-- Estrutura da tabela `teste_user`
--

CREATE TABLE `teste_user` (
  `id` int(11) NOT NULL,
  `nome` varchar(220) COLLATE utf8_unicode_ci NOT NULL,
  `user` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `telefone` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `cep` varchar(22) COLLATE utf8_unicode_ci NOT NULL,
  `rua` varchar(220) COLLATE utf8_unicode_ci NOT NULL,
  `cidade` varchar(220) COLLATE utf8_unicode_ci NOT NULL,
  `estado` varchar(220) COLLATE utf8_unicode_ci NOT NULL,
  `senha` varchar(55) COLLATE utf8_unicode_ci NOT NULL,
  `imagens` varchar(220) COLLATE utf8_unicode_ci NOT NULL,
  `profissao` varchar(220) COLLATE utf8_unicode_ci DEFAULT NULL,
  `status` tinyint(4) DEFAULT NULL,
  `qnt_voto` int(11) DEFAULT 0
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `teste_user`
--

INSERT INTO `teste_user` (`id`, `nome`, `user`, `email`, `telefone`, `cep`, `rua`, `cidade`, `estado`, `senha`, `imagens`, `profissao`, `status`, `qnt_voto`) VALUES
(25, 'Alex Soares', 'soaresAlex', 'teste011@gmail.com', '31555555', '31200250', 'CaiÃ§ara, 1400', 'BH', 'MG', 'fc9bc620bba72c7f56e09c5d6aa99f5f', '8ba579bb108059de17640211ee489bd43.jpg', 'Jardineiro', 1, 0),
(24, 'Lucas Gomes', 'gomesLucas', 'teste010@gmail.com', '31212121', '31250700', 'Campos, 1400', 'BH', 'MG', 'fc9bc620bba72c7f56e09c5d6aa99f5f', 'a36d4615eeb70f0106671867ac7f30f62.jpg', 'Jardineiro', 1, 0),
(23, 'Neiva Rosa', 'rosaNeiva', 'teste009@gmail.com', '31525252', '31800400', 'Manoel Leal, 14', 'BH', 'MG', 'fc9bc620bba72c7f56e09c5d6aa99f5f', 'ea092bd25b233c99f5064affc9ff56efa.jpg', 'Jardineiro', 1, 0),
(22, 'Leticia Duarte', 'duarteLeticia', 'teste008@gmail.com', '3185856565', '31400500', 'CaiÃ§ara, 140', 'BH', 'BH', 'fc9bc620bba72c7f56e09c5d6aa99f5f', 'aca571ad1e9746ddd03f3493ed9f03bf3.jpg', 'Eletricista', 1, 1),
(21, 'Laura da Silva', 'silvaLaura', 'teste007@gmail.com', '319525252', '31900800', 'Flores, 22', 'BH', 'MG', 'fc9bc620bba72c7f56e09c5d6aa99f5f', 'ffd5d0c20ae54f9de775c62fa6f6dd3b2.jpg', 'Eletricista', 1, 0),
(20, 'Vitor dos Santos', 'santosVitor', 'teste006@gmail.com', '317575757', '31800125', 'Alto CaiÃ§ara, 22', 'BH', 'MG', 'fc9bc620bba72c7f56e09c5d6aa99f5f', '1e4d32c3f4f5bc14ccb66cc676c7be76a.jpg', 'Eletricista', 1, 0),
(19, 'Ricardo Freitas', 'ricardoFreitas', 'teste005@gmail.com', '318282828', '31500120', 'Jardim, 11', 'BH', 'MG', 'fc9bc620bba72c7f56e09c5d6aa99f5f', '5df18092820b4572dde9d68d5d410ecd3.jpg', 'Bombeiro Hidráulico', 1, 0),
(18, 'Anna Clara', 'clarAnna', 'teste004@gmail.com', '319222222', '31700200', 'Bom Jesus, 22', 'BH', 'MG', 'fc9bc620bba72c7f56e09c5d6aa99f5f', 'af077e49a4921afbdb1da33ad75ab7222.jpg', 'Bombeiro Hidráulico', 1, 1),
(17, 'Matheus Santos Carneiro', 'mbugger', 'teste003@gmail.com', '3194213902', '31250700', 'Manoel Ferreira Leal, 22', 'BH', 'MG', 'fc9bc620bba72c7f56e09c5d6aa99f5f', '88b10ba264f97763d13aa4b93e6acc091.jpg', 'Bombeiro Hidráulico', 1, 0),
(16, 'Ana Luiza', 'LuizaAna', 'teste002@gmail.com', '319998080', '31250100', 'Floresta, 55', 'BH', 'MG', 'fc9bc620bba72c7f56e09c5d6aa99f5f', '1e9524e527ee79bac3e71ba4f9ec01f13.jpg', 'Pintor', 1, 0),
(14, 'Guilherme Diniz', 'dinizGui', 'teste000@gmail.com', '3199999999', '3155200', 'Manoel Ferreira Leal, 29', 'BH', 'MG', 'fc9bc620bba72c7f56e09c5d6aa99f5f', 'e537bd09df57a50bcfd14f73f0a732df1.png', 'Pintor', 1, 1),
(15, 'RaÃ­ssa Carolina', 'carolinaRaissa', 'teste001@gmail.com', '3194942121', '31250800', 'Chica da Silva, 49', 'BH', 'MG', 'fc9bc620bba72c7f56e09c5d6aa99f5f', '11418808cf6d922f7db1c53a0408f4c22.png', 'Pintor', 1, 0),
(26, 'Mateus Santos Rosa Carneiro', 'carneiroMatheus', 'teste012@gmail.com', '314444444', '31250700', 'Rua da Bahia, 77', 'BH', 'MG', 'fc9bc620bba72c7f56e09c5d6aa99f5f', '1dba1eb82d7b2757764a895c5049b6f8o.jpg', 'Pedreiro', 1, 2),
(27, 'Guilherme dos Anjos', 'AnjosGui', 'teste013@gmail.com', '31727272', '31200140', 'Rua dos CaetÃ©s', 'BH', 'MG', 'fc9bc620bba72c7f56e09c5d6aa99f5f', 'ad850805c2d147c103a27f77c4b198ab2.jpg', 'Pedreiro', 1, 0),
(28, 'RaÃ­ssa Vilela', 'vilelaRaissa', 'teste014@gmail.com', '312202020', '31400900', 'Rua JacuÃ­, 100', 'BH', 'MG', 'fc9bc620bba72c7f56e09c5d6aa99f5f', '45591c18ae7e04dd48976571475043b42.jpg', 'Pedreiro', 1, 0),
(29, 'JoÃ£o Ricardo', 'ricardoJoao', 'teste015@gmail.com', '31552020', '31830240', 'Rua do Ouro, 120', 'BH', 'MG', 'fc9bc620bba72c7f56e09c5d6aa99f5f', 'f03d3594179e474d97a7c976bab8b6e51.jpg', 'Gesseiro', 1, 0),
(30, 'JosÃ© Pimentel ', 'pimentelJose', 'teste016@gmail.com', '31521525', '31200150', 'Aparecida, 12', 'BH', 'MG', 'fc9bc620bba72c7f56e09c5d6aa99f5f', '469dceb5629ea81650f27b14361764cf2.jpg', 'Gesseiro', 1, 0),
(31, 'Ana Luiza Flores', 'floresAna', 'teste017@gmail.com', '31252525', '31000100', 'Pedre EustÃ¡quio', 'BH', 'MG', 'fc9bc620bba72c7f56e09c5d6aa99f5f', 'd3bbc0fa1fd5017636c192a2bc2e4ded3.png', 'Gesseiro', 1, 0),
(32, 'Maria das Dores', 'doresMaria', 'teste018@gmail.com', '31565656', '3130300', 'Av Afonso Pena', 'BH', 'MG', 'fc9bc620bba72c7f56e09c5d6aa99f5f', 'c535c713b987b82b4c9b1cd6003b78f21.jpg', 'Carpinteiro', 1, 0),
(33, 'Judas Tadeu', 'tadeuJudas', 'teste019@gmail.com', '31515151', '31313121', 'Av Amazonas, 500', 'BH', 'MG', 'fc9bc620bba72c7f56e09c5d6aa99f5f', 'a545a44866fb724cec829aedc33bbd832.jpg', 'Carpinteiro', 1, 0),
(34, 'Jessica Alves', 'alvesJessica', 'teste020@gmail.com', '31202020', '31400550', 'PraÃ§a da Bandeira, 11', 'BH', 'MG', 'fc9bc620bba72c7f56e09c5d6aa99f5f', '92ef6a8c2adcfb2019a1840157a028873.jpg', 'Carpinteiro', 1, 0),
(35, 'RaÃ­ssa Carolina Vilela', 'carolVilela', 'teste021@gmail.com', '31945454', '31250120', 'Manoel Ferreira, 11', 'BH', 'MG', 'fc9bc620bba72c7f56e09c5d6aa99f5f', '19e1328fe036d9e4786b852f24a5d3001.jpg', 'Decorador', 1, 0),
(36, 'Ana Flores', 'FloresAninha', 'teste022@gmail.com', '31202121', '31400255', 'Av Afonso Pena, 140', 'BH', 'MG', 'fc9bc620bba72c7f56e09c5d6aa99f5f', 'b1d23118ea9fecb7b49da849bc4843e62.jpg', 'Decorador', 1, 0),
(37, 'Helena Silva', 'silvaHelena', 'teste023@gmail.com', '312858585', '31000250', 'Rua do Ouro, 140', 'BH', 'MG', 'fc9bc620bba72c7f56e09c5d6aa99f5f', 'e6a0bf48c9bca81b917d14e5465c49883.jpg', 'Decorador', 1, 0),
(50, 'João das Couve', 'Guidi', 'guicbdeniz@hotmail.com', '31996796041', '30310710', 'Florida', 'Belo Horizonte', 'Mg', '827ccb0eea8a706c4c34a16891f84e7b', '4bb0b0d7c80aae091712eb06124e9bdcn.png', 'Pintor', 1, 0),
(51, 'Joao das Couves', 'Jao', 'guicbdeniz@hotmail.com', '31996796041', '30310710', 'Florida', 'Belo Horizonte', 'MG', 'fe452152faec60d73c3f00c3bb985fe9', '76591f51308d3ed9556bac8e573f6169n.png', 'Decorador', 1, 0),
(52, 'Mario Ricardo', 'Mario', 'guicbdeniz@hotmail.com', '3999999999', '30710810', 'Florida', 'Belo Horizonte', 'MG', 'c753d566bb696fbc6e5af44e059ee298', '53a5640d17b0b46ccd3a09e4b34375cen.png', 'Eletricista', NULL, 0),
(53, 'Andre Campos', 'AndreC', 'guicbdiniz@hotmail.com', '31996796041', '30310710', 'Florida', 'Belo Horizonte', 'MG', 'c753d566bb696fbc6e5af44e059ee298', '3ab224c12c3d06fe6f2329d7e78e6daen.png', 'Pintor', NULL, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `comments`
--
ALTER TABLE `comments`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `imagens`
--
ALTER TABLE `imagens`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `teste_user`
--
ALTER TABLE `teste_user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `comments`
--
ALTER TABLE `comments`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `imagens`
--
ALTER TABLE `imagens`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `teste_user`
--
ALTER TABLE `teste_user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=56;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
