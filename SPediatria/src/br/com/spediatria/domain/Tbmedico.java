package br.com.spediatria.domain;

public class Tbmedico {
	private Long codigo;
	private String nome;
	private Long crm;
	private String estado;
	private Tbespecialidades especialidade;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCrm() {
		return crm;
	}

	public void setCrm(Long crm) {
		this.crm = crm;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Tbespecialidades getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Tbespecialidades especialidade) {
		this.especialidade = especialidade;
	}
}
