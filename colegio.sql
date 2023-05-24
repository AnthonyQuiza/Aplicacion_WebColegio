-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-05-2022 a las 00:35:31
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `colegio`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `curso`
--

CREATE TABLE `curso` (
  `idCurso` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `docente` varchar(45) DEFAULT NULL,
  `lugar` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `curso`
--

INSERT INTO `curso` (`idCurso`, `nombre`, `docente`, `lugar`) VALUES
(1, 'Matematicas', 'Carlos Hurtado', 'Sede Arequipa'),
(2, 'Lenguaje', 'Luis Felipe', 'Sede Arequipa');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `docentes`
--

CREATE TABLE `docentes` (
  `idDocente` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `especialidad` varchar(80) DEFAULT NULL,
  `fechaIngreso` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `docentes`
--

INSERT INTO `docentes` (`idDocente`, `nombre`, `apellido`, `especialidad`, `fechaIngreso`) VALUES
(1, 'Ricardo Moran', 'Mendoza', 'Matematicas', '15/02/2000'),
(2, 'Paul ', 'Mendoza del Carpio', 'Desarrollo Web', '4/05/2001'),
(3, 'Jhon Edilberto', 'Monroy Barrios', 'Innovacion y Transformacion Digital', '8/06/2010'),
(4, 'Gerson Roberto', 'Lama ', 'Letras', '10/04/2012'),
(5, 'Jimmy', 'Chocano Vizarreta', 'Historia del Peru', '20/08/2015'),
(8, 'Sara', 'Mendoza Flores', 'Bilogia', '8/06/2010'),
(9, 'Malena', 'Villavicencio', 'Matematica', '20/08/2018'),
(10, 'Maria del Carmen', 'Rosales', 'Matematicas', '20/11/2020'),
(11, 'Gianpiero', 'Mendoza', 'Desarrollo Web Integrado', '10/04/2012'),
(12, 'Jody', 'Mendoza Quispe', 'Letras', '20/08/2013');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbalumno`
--

CREATE TABLE `tbalumno` (
  `idtbAlumno` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `edad` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tbalumno`
--

INSERT INTO `tbalumno` (`idtbAlumno`, `nombre`, `apellido`, `edad`) VALUES
(1, 'Maria Fernanda', 'Quiroz Perez', 19),
(2, 'Noelia Zoe', 'Flores', 16),
(8, 'Edu Riltex', 'Bladimir', 21),
(9, 'Sara Jody', 'Zeballos', 20),
(10, 'Malena I.', 'Villavicencio', 25),
(14, 'Maria del Carmen', 'Loayza Cuba', 17),
(18, 'Diego', 'Obando Lazo', 28),
(20, 'Bryan', 'Chua Cansaya', 35),
(24, 'Anthony Josua', 'Flores', 22),
(26, 'Sara', 'Villavicencio', 22);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tdadministrativo`
--

CREATE TABLE `tdadministrativo` (
  `cod_emp` int(11) NOT NULL,
  `nom_emp` varchar(30) DEFAULT NULL,
  `ape_emp` varchar(30) DEFAULT NULL,
  `login_emp` varchar(20) DEFAULT NULL,
  `clave_emp` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tdadministrativo`
--

INSERT INTO `tdadministrativo` (`cod_emp`, `nom_emp`, `ape_emp`, `login_emp`, `clave_emp`) VALUES
(1, 'Carlos', 'Macedo', 'cmacedo', '123456'),
(2, 'Luis', 'Carpio', 'lcarpio', '654321'),
(7, 'Arturo', 'Delgado', 'adelgado', '12345');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `curso`
--
ALTER TABLE `curso`
  ADD PRIMARY KEY (`idCurso`);

--
-- Indices de la tabla `docentes`
--
ALTER TABLE `docentes`
  ADD PRIMARY KEY (`idDocente`);

--
-- Indices de la tabla `tbalumno`
--
ALTER TABLE `tbalumno`
  ADD PRIMARY KEY (`idtbAlumno`);

--
-- Indices de la tabla `tdadministrativo`
--
ALTER TABLE `tdadministrativo`
  ADD PRIMARY KEY (`cod_emp`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `curso`
--
ALTER TABLE `curso`
  MODIFY `idCurso` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `docentes`
--
ALTER TABLE `docentes`
  MODIFY `idDocente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `tbalumno`
--
ALTER TABLE `tbalumno`
  MODIFY `idtbAlumno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT de la tabla `tdadministrativo`
--
ALTER TABLE `tdadministrativo`
  MODIFY `cod_emp` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
