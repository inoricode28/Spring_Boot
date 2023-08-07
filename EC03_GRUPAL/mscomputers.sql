CREATE DATABASE mscomputers;

USE mscomputers;

CREATE TABLE
    IF NOT EXISTS `usuarios` (
        `id` int NOT NULL AUTO_INCREMENT,
        `correo` varchar(255) DEFAULT NULL,
        `contrasena` varchar(255) DEFAULT NULL,
        PRIMARY KEY (`id`),
        UNIQUE KEY `id` (`id`)
    ) ENGINE = InnoDB AUTO_INCREMENT = 4 DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

LOCK TABLES `usuarios` WRITE;

CREATE TABLE
    `categoria` (
        `cod_categoria` int NOT NULL AUTO_INCREMENT,
        `descripcion` varchar(255) DEFAULT NULL,
        `marca` varchar(255) DEFAULT NULL,
        `nombre` varchar(255) DEFAULT NULL,
        `nomproveerdor` varchar(255) DEFAULT NULL,
        PRIMARY KEY (`cod_categoria`)
    ) ENGINE = InnoDB AUTO_INCREMENT = 6 DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

LOCK TABLES `categoria` WRITE;

CREATE TABLE
    Ventas (
        ID_Cliente VARCHAR(5),
        Codigo VARCHAR(10),
        Producto VARCHAR(100),
        Precio_Unitario DECIMAL(10, 2)
    ) ENGINE = INNODB;

CREATE TABLE
    IF NOT EXISTS `pedidos` (
        `id` int NOT NULL AUTO_INCREMENT,
        `dni` varchar(255) DEFAULT NULL,
        `direccion` varchar(255) DEFAULT NULL,
        `fechaentrega` varchar(255) DEFAULT NULL,
        `nombrecliente` varchar(255) DEFAULT NULL,
        `telefonocliente` varchar(255) DEFAULT NULL,
        PRIMARY KEY (`id`),
        UNIQUE KEY `id` (`id`)
    ) ENGINE = InnoDB AUTO_INCREMENT = 4 DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

--

-- Volcado de datos para la tabla `pedidos`

--

INSERT INTO
    `pedidos` (
        `id`,
        `dni`,
        `direccion`,
        `fechaentrega`,
        `nombrecliente`,
        `telefonocliente`
    )
VALUES (
        1,
        '72225484',
        'Av Rosales 1553',
        '11-12-2023',
        'Pedro Jimenez Rar',
        '014204988'
    ), (
        2,
        '12556987',
        'Jr Garcia 255, Surquillo',
        '12-09-2023',
        'Pierina Guren Rivas',
        '935566584'
    ), (
        3,
        '15336976',
        'av Insurgentes 177',
        '08-08-2023',
        'Aldo Zuñiga Lorca',
        '989855214'
    ), (
        4,
        '35782146',
        'Calle Primavera 789, Miraflores',
        '20-10-2023',
        'María Rodríguez',
        '956214789'
    ), (
        5,
        '98765432',
        'Av. San Martín 456, La Molina',
        '05-11-2023',
        'Luis González',
        '987654321'
    ), (
        6,
        '65478912',
        'Jr. Los Pinos 321, San Isidro',
        '15-09-2023',
        'Ana Pérez',
        '921457836'
    ), (
        7,
        '84561239',
        'Calle Los Pájaros 567, San Borja',
        '25-09-2023',
        'Carlos Fernández',
        '978321456'
    ), (
        8,
        '23659874',
        'Av. Los Robles 888, La Victoria',
        '14-10-2023',
        'Laura Pérez',
        '915874632'
    ), (
        9,
        '98745632',
        'Jr. Las Flores 123, Lince',
        '02-11-2023',
        'Juan González',
        '987123456'
    );

INSERT INTO `usuarios`
VALUES (
        1,
        'gomezp@gmail.com',
        'ABC553'
    ), (
        2,
        'lopezr@hotmail.com',
        'DFB255'
    ), (
        3,
        'pt40383@outlook.com',
        'MSN177'
    );

INSERT INTO
    Ventas (
        ID_Cliente,
        Codigo,
        Producto,
        Precio_Unitario
    )
VALUES (
        'C001',
        'AK210',
        'Mouse Gamer',
        500
    );

INSERT INTO
    Ventas (
        ID_Cliente,
        Codigo,
        Producto,
        Precio_Unitario
    )
VALUES (
        'C002',
        'AK892',
        'Teclado Gamer',
        800
    );

INSERT INTO
    Ventas (
        ID_Cliente,
        Codigo,
        Producto,
        Precio_Unitario
    )
VALUES (
        'C003',
        'AK831',
        'Monitor Asus ',
        1200
    );

INSERT INTO
    Ventas (
        ID_Cliente,
        Codigo,
        Producto,
        Precio_Unitario
    )
VALUES (
        'C004',
        'AK892',
        'Procesador i3 9vena',
        900
    );

INSERT INTO
    Ventas (
        ID_Cliente,
        Codigo,
        Producto,
        Precio_Unitario
    )
VALUES (
        'C005',
        'AK451',
        'Memoria Ram DDR5',
        200
    );

INSERT INTO
    Ventas (
        ID_Cliente,
        Codigo,
        Producto,
        Precio_Unitario
    )
VALUES (
        'C006',
        'AK726',
        'Refrigeracion Liquida Asus',
        850
    );

INSERT INTO
    Ventas (
        ID_Cliente,
        Codigo,
        Producto,
        Precio_Unitario
    )
VALUES (
        'C007',
        'AK214',
        'Case Vampyric',
        220
    );

INSERT INTO
    Ventas (
        ID_Cliente,
        Codigo,
        Producto,
        Precio_Unitario
    )
VALUES (
        'C008',
        'AK367',
        'Tarjeta Madre Gigabyte',
        720
    );

INSERT INTO
    Ventas (
        ID_Cliente,
        Codigo,
        Producto,
        Precio_Unitario
    )
VALUES (
        'C009',
        'AK781',
        'Disdo Duro 1TB',
        100
    );

INSERT INTO
    Ventas (
        ID_Cliente,
        Codigo,
        Producto,
        Precio_Unitario
    )
VALUES (
        'C010',
        'AK471',
        'Disdo SSD 250GB',
        320
    );

INSERT INTO `categoria`
VALUES (
        1,
        'Pantalla 34 pulgadas',
        'Samsung',
        'Monitor',
        'Deltron'
    ), (
        2,
        'Mourse Dpi 148',
        'Logitec',
        'Mouse',
        'Deltron'
    ), (
        3,
        'Memoria de DRR3 8GB',
        'Kingston',
        'Memoria Ram',
        'Deltron'
    ), (
        4,
        'GTM-458 DSU',
        'Asus',
        'Placa',
        'Deltron'
    ), (
        5,
        'Rayzen 7 7500',
        'Rayzen',
        'Procesador',
        'Deltron'
    );

UNLOCK TABLES;