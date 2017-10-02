package br.com.spediatria.domain;

public class Tbpaciente {
	private Long codigo;
	private Long cpf;
	private String nome;
	private Long rg;
	private Long datanasc;
	private String nacionalidade;
	private String mae;
	private String pai;
	private String sexo;
	private Long peso;
	private Long altura;
	
	public Long getCodigo(Long codigo){
		return codigo;
	}
	public void setCodigo(Long codigo){
		this.codigo = codigo;
	}
	public Long getCpf(){
		return cpf;
	}
	public void setCpf(Long cpf){
		this.cpf = cpf;
	}
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public Long getRg(){
		return rg;
	}
	public void setRg(Long rg){
		this.rg = rg;
	}
	public Long getDatanasc(){
		return datanasc;
	}
	public void setDatanasc(Long datanasc){
		this.datanasc = datanasc;
	}
	public String getNacionalidade(){
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade){
		this.nacionalidade = nacionalidade;
	}
	public String getMae(){
		return mae;
	}
	public void setMae(String mae){
		this.mae = mae;
	}
	public String getPai(){
		return mae;
	}
	public void setPai(String pai){
		this.pai = pai;
	}
	public String getSexo(){
		return sexo;
	}
	public void setSexo(String sexo){
		this.sexo = sexo;
	}
	public Long getPeso(){
		return peso;
	}
	public void setPeso(Long peso){
		this.peso = peso;
	}
	public Long getAltura(){
		return altura;
	}
	public void setAltura(Long altura){
		this.altura = altura;
	}	
}