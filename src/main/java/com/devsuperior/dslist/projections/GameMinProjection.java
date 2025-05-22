package com.devsuperior.dslist.projections;

//Onde faço os getters de cada atributo da consulta SQL
public interface GameMinProjection {
	Long getId();
	String getTitle();
	Integer getYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
}
