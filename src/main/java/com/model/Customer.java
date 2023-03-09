package com.model;

public class Customer {

	//codigo unico de cliente
	private String id;
	
	//Nombre de cliente o nombre de empresa
	private String name;
	
	//Primer Apellido de cliente personal
	private String lastName1;
	
	//Segundo Apellido de cliente personal
	private String lastName2;
	
	//Numero de identificación (DNI-01, CARNET_EXT-04,RUC-06, PASAPORTE-07 y PART_NACIMIENTO-11)
	private String docId;
	
	//Tipo de documento de identificación (DNI-01, CARNET_EXT-04,RUC-06, PASAPORTE-07 y PART_NACIMIENTO-11)
	private String documentType;
	
	//Tipo de cliente
	private String customerType;
	
	//Fecha creacion del registro
	private String dateCreate;
	
	//Fecha modificacion del registro
	private String dateModify;
	
	//Fecha nacimiento para personas y creacion para empresas
	private String dateCustomer;
	
	
	
}
