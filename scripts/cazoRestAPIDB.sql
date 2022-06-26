#CREATE DATABASE IF NOT EXISTS `cazoRestAPIDB`;

USE `cazoRestAPIDB`;

/*CREATE TABLE `documentos`(
	`documentos_id` BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    `documentos_tipo` ENUM("DNI", "LE", "LC", "CI"),
    `documentos_valor` VARCHAR(20) NOT NULL
);

CREATE TABLE `procedencias`(
	`procedencias_id` BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    `procedencias_nac` VARCHAR(100) NOT NULL,
    `procedencias_prov` VARCHAR(100) NOT NULL,
    `procedencias_ciudad` VARCHAR(100) NOT NULL,
    `procedencias_loc` VARCHAR(100) NOT NULL,
    `procedencias_dir` VARCHAR(100) NOT NULL,
    `procedencias_dir_num` INT NOT NULL,
    `procedencias_cod` VARCHAR(10) NOT NULL
);

CREATE TABLE `imagenes`(
	`imagenes_id` BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    `imagenes_mime` VARCHAR(255),
    `imagenes_nombre` VARCHAR(255),
    `imagenes_contenido` LONGBLOB
);

CREATE TABLE `usuarios`(
	`usuarios_id` BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    `usuarios_nombre` VARCHAR(50) NOT NULL,
    `usuarios_clave` VARCHAR(255) NOT NULL,
    `usuarios_clave_rep` VARCHAR(255) NOT NULL,
    `usuarios_tipo` ENUM("NORMAL", "ADMINISTRADOR") DEFAULT "NORMAL",
    `imagenes_id` BIGINT(20),
    CONSTRAINT `fk_foto_usuario` FOREIGN KEY(`imagenes_id`) REFERENCES `imagenes`(`imagenes_id`)
);

CREATE TABLE `socios`(
	`socios_id` BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    `socios_nombre` VARCHAR(50) NOT NULL,
    `socios_apellido` VARCHAR(50) NOT NULL,
    `socios_sexo` ENUM("MASCULINO", "FEMENINO", "OTRO") NOT NULL,
    `socios_fecha_nac` DATE NOT NULL,
    `socios_telefono` VARCHAR(20) NOT NULL,
    `socios_correo` VARCHAR(255) NOT NULL,
    `usuarios_id` BIGINT(20),
    `documentos_id` BIGINT(20),
    `procedencias_id` BIGINT(20),
    CONSTRAINT `fk_socio_usuario` FOREIGN KEY(`usuarios_id`) REFERENCES `usuarios`(`usuarios_id`),
    CONSTRAINT `fk_socio_documento` FOREIGN KEY(`documentos_id`) REFERENCES `documentos`(`documentos_id`),
    CONSTRAINT `fk_socio_procedencia` FOREIGN KEY(`procedencias_id`) REFERENCES `procedencias`(`procedencias_id`)
);

CREATE TABLE `actividades`(
	`actividades_id` BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    `actividades_nombre` VARCHAR(50) NOT NULL
);

CREATE TABLE `actividades_tipo`(
	`actividades_tipo_id` BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    `actividades_tipo_nombre` VARCHAR(50) NOT NULL,
    `actividades_tipo_descripcion` VARCHAR(255) NOT NULL,
    `actividades_id` BIGINT(20),
    CONSTRAINT `fk_actividad_actividad_tipo` FOREIGN KEY(`actividades_id`) REFERENCES `actividades`(`actividades_id`)
);

CREATE TABLE `tarjetas`(
	`tarjetas_id` BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    `tarjetas_nombre_completo` VARCHAR(255) NOT NULL,
    `tarjetas_numero` VARCHAR(19) NOT NULL,
    `tarjetas_cvc` VARCHAR(3) NOT NULL,
    `tarjetas_fecha_vencimiento` DATE NOT NULL
);

CREATE TABLE `metodos_pago`(
	`metodos_pago_id` BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    `metodos_pago_tipo` ENUM("Tarjeta de débito", "Tarjeta de cŕedito") NOT NULL,
    `tarjetas_id` BIGINT(20),
    CONSTRAINT `fk_metodo_pago_tarjeta` FOREIGN KEY(`tarjetas_id`) REFERENCES `tarjetas`(`tarjetas_id`)
);

CREATE TABLE `reservas`(
	`reservas_id` BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    `reservas_fecha` DATE NOT NULL,
    `actividades_id` BIGINT(20),
    `actividades_tipo_id` BIGINT(20),
    `usuarios_id` BIGINT(20),
    CONSTRAINT `fk_reserva_actividad` FOREIGN KEY(`actividades_id`) REFERENCES `actividades`(`actividades_id`),
    CONSTRAINT `fk_reserva_actividad_tipo` FOREIGN KEY(`actividades_tipo_id`) REFERENCES `actividades_tipo`(`actividades_tipo_id`),
    CONSTRAINT `fk_reserva_usuario` FOREIGN KEY(`usuarios_id`) REFERENCES `usuarios`(`usuarios_id`)
);*/