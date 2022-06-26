#CREATE DATABASE IF NOT EXISTS `cazoRestAPIDB`;

USE `cazoRestAPIDB`;

/*CREATE TABLE `documentos`(
	`documento_id` BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    `documento_tipo` ENUM("DNI", "LE", "LC", "CI"),
    `documento_valor` VARCHAR(20) NOT NULL
);

CREATE TABLE `procedencias`(
	`procedencia_id` BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    `procedencia_nac` VARCHAR(100) NOT NULL,
    `procedencia_prov` VARCHAR(100) NOT NULL,
    `procedencia_ciudad` VARCHAR(100) NOT NULL,
    `procedencia_loc` VARCHAR(100) NOT NULL,
    `procedencia_dir` VARCHAR(100) NOT NULL,
    `procedencia_dir_num` INT NOT NULL,
    `procedencia_cod` VARCHAR(10) NOT NULL
);

CREATE TABLE `imagenes`(
	`imagen_id` BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    `imagen_mime` VARCHAR(255),
    `imagen_nombre` VARCHAR(255),
    `imagen_contenido` LONGBLOB
);

CREATE TABLE `usuarios`(
	`usuario_id` BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    `usuario_nombre` VARCHAR(50) NOT NULL,
    `usuario_clave` VARCHAR(255) NOT NULL,
    `usuario_clave_rep` VARCHAR(255) NOT NULL,
    `usuario_tipo` ENUM("NORMAL", "ADMINISTRADOR") DEFAULT "NORMAL",
    `imagen_id` BIGINT(20),
    CONSTRAINT `fk_foto_usuario` FOREIGN KEY(`imagen_id`) REFERENCES `imagenes`(`imagen_id`)
);

CREATE TABLE `socios`(
	`socio_id` BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    `socio_nombre` VARCHAR(50) NOT NULL,
    `socio_apellido` VARCHAR(50) NOT NULL,
    `socio_sexo` ENUM("MASCULINO", "FEMENINO", "OTRO") NOT NULL,
    `socio_fecha_nac` DATE NOT NULL,
    `socio_telefono` VARCHAR(20) NOT NULL,
    `socio_correo` VARCHAR(255) NOT NULL,
    `usuario_id` BIGINT(20),
    `documento_id` BIGINT(20),
    `procedencia_id` BIGINT(20),
    CONSTRAINT `fk_socio_usuario` FOREIGN KEY(`usuario_id`) REFERENCES `usuarios`(`usuario_id`),
    CONSTRAINT `fk_socio_documento` FOREIGN KEY(`documento_id`) REFERENCES `documentos`(`documento_id`),
    CONSTRAINT `fk_socio_procedencia` FOREIGN KEY(`procedencia_id`) REFERENCES `procedencias`(`procedencia_id`)
);

CREATE TABLE `actividades`(
	`actividad_id` BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    `actividad_nombre` VARCHAR(50) NOT NULL
);

CREATE TABLE `actividades_tipo`(
	`actividad_tipo_id` BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    `actividad_tipo_nombre` VARCHAR(50) NOT NULL,
    `actividad_tipo_descripcion` VARCHAR(255) NOT NULL,
    `actividad_id` BIGINT(20),
    CONSTRAINT `fk_actividad_actividad_tipo` FOREIGN KEY(`actividad_id`) REFERENCES `actividades`(`actividad_id`)
);

CREATE TABLE `tarjetas`(
	`tarjeta_id` BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    `tarjeta_nombre_completo` VARCHAR(255) NOT NULL,
    `tarjeta_numero` VARCHAR(19) NOT NULL,
    `tarjeta_cvc` VARCHAR(3) NOT NULL,
    `tarjeta_fecha_vencimiento` DATE NOT NULL
);

CREATE TABLE `metodos_pago`(
	`metodo_pago_id` BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    `metodo_pago_tipo` ENUM("Tarjeta de débito", "Tarjeta de cŕedito") NOT NULL,
    `tarjeta_id` BIGINT(20),
    CONSTRAINT `fk_metodo_pago_tarjeta` FOREIGN KEY(`tarjeta_id`) REFERENCES `tarjetas`(`tarjeta_id`)
);

CREATE TABLE `reservas`(
	`reserva_id` BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    `reserva_fecha` DATE NOT NULL,
    `actividad_id` BIGINT(20),
    `actividad_tipo_id` BIGINT(20),
    `usuario_id` BIGINT(20),
    CONSTRAINT `fk_reserva_actividad` FOREIGN KEY(`actividad_id`) REFERENCES `actividades`(`actividad_id`),
    CONSTRAINT `fk_reserva_actividad_tipo` FOREIGN KEY(`actividad_tipo_id`) REFERENCES `actividades_tipo`(`actividad_tipo_id`),
    CONSTRAINT `fk_reserva_usuario` FOREIGN KEY(`usuario_id`) REFERENCES `usuarios`(`usuario_id`)
);*/