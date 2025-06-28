CREATE DATABASE SistemaDeUsuarios;
USE SistemaDeUsuarios;



CREATE TABLE Usuario (
  id INT PRIMARY KEY,
  nombre VARCHAR(255),
  email VARCHAR(255),
  FOREIGN KEY (id_Rol) REFERENCES Rol(id),



CREATE TABLE Rol (
  codigo INT PRIMARY KEY,
  descripcion VARCHAR(255),



CREATE TABLE FormularioRegistro (
  inputNombre VARCHAR(255),
  inputEmail VARCHAR(255),


