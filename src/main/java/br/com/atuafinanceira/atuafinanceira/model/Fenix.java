package br.com.atuafinanceira.atuafinanceira.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="bd_atua_fenix")
public class Fenix {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Date extracao;
	private String origem;
	private Date data_imput;
	private String nun_parcela;
	private String autor_cadastro;
	private String nome_cliente;
	private String telefones;
	private String gc;
	private String endereço;
	private String estado;
	private String num;
	private String descricao_contrato;
	private String cpf;
	private String cnpJ;
	private String cep;
	private String bairro;
	private String cidade;
	private String Tipo_Comercio;
	private String Atividade_Principal_empresa;
	private String tipo_empresa;
	private String nome_fantasia_empresa;
	private String rua_empresa;
	private String compl_empresa;
	private String num_empresa;
	private String porte_empresa;
	private String cnae_empresa;
	private String razao_social_empresa;
	private String cap_social_empresa;
	private String situacao_empresa;
	private String email_empresa;
	private String natureza_juridica;
	private String data_abertura_empresa;
	private double valor_emprestimo;
	private double parcelas;
	private double valor_parcela;
	private Date data_inicio;
	private double taxa_juros;
	private double cet;
	private String tipo_recebimento;
	private Date data_primero_pgt;
	private long Numero_contrato;
	private String Chave_baixa_parcela;
	private String Chave;
	private long ordem_parcela;
	private Date data_vencimento;
	private String dias_em_atraso;
	private String dia_da_semana;
	private double Valor_parcela_atualizado;
	private double valor_pago_pelo_cliente;
	private Date data_de_pagamento;
	private String houve_recebimento;
	private double cc_credito;
	private double cc_debito;
	private double saldo_corrente;
	private String Status;
	private String Situacao;
	private String rota;
	private String operacao;
	private String Lucro_Esperado;
	private String Tipo_pagamento;
	private double Lucro_Por_Parcela;
	private double valor_disponibilizado;
	private String Agente_Cobranca;
	private String aprovacao_pagamento;
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getExtracao() {
		return extracao;
	}
	public void setExtracao(Date extracao) {
		this.extracao = extracao;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public Date getData_imput() {
		return data_imput;
	}
	public void setData_imput(Date data_imput) {
		this.data_imput = data_imput;
	}
	public String getNun_parcela() {
		return nun_parcela;
	}
	public void setNun_parcela(String nun_parcela) {
		this.nun_parcela = nun_parcela;
	}
	public String getAutor_cadastro() {
		return autor_cadastro;
	}
	public void setAutor_cadastro(String autor_cadastro) {
		this.autor_cadastro = autor_cadastro;
	}
	public String getNome_cliente() {
		return nome_cliente;
	}
	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}
	public String getTelefones() {
		return telefones;
	}
	public void setTelefones(String telefones) {
		this.telefones = telefones;
	}
	public String getGc() {
		return gc;
	}
	public void setGc(String gc) {
		this.gc = gc;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getDescricao_contrato() {
		return descricao_contrato;
	}
	public void setDescricao_contrato(String descricao_contrato) {
		this.descricao_contrato = descricao_contrato;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCnpJ() {
		return cnpJ;
	}
	public void setCnpJ(String cnpJ) {
		this.cnpJ = cnpJ;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getTipo_Comercio() {
		return Tipo_Comercio;
	}
	public void setTipo_Comercio(String tipo_Comercio) {
		Tipo_Comercio = tipo_Comercio;
	}
	public String getAtividade_Principal_empresa() {
		return Atividade_Principal_empresa;
	}
	public void setAtividade_Principal_empresa(String atividade_Principal_empresa) {
		Atividade_Principal_empresa = atividade_Principal_empresa;
	}
	public String getTipo_empresa() {
		return tipo_empresa;
	}
	public void setTipo_empresa(String tipo_empresa) {
		this.tipo_empresa = tipo_empresa;
	}
	public String getNome_fantasia_empresa() {
		return nome_fantasia_empresa;
	}
	public void setNome_fantasia_empresa(String nome_fantasia_empresa) {
		this.nome_fantasia_empresa = nome_fantasia_empresa;
	}
	public String getRua_empresa() {
		return rua_empresa;
	}
	public void setRua_empresa(String rua_empresa) {
		this.rua_empresa = rua_empresa;
	}
	public String getCompl_empresa() {
		return compl_empresa;
	}
	public void setCompl_empresa(String compl_empresa) {
		this.compl_empresa = compl_empresa;
	}
	public String getNum_empresa() {
		return num_empresa;
	}
	public void setNum_empresa(String num_empresa) {
		this.num_empresa = num_empresa;
	}
	public String getPorte_empresa() {
		return porte_empresa;
	}
	public void setPorte_empresa(String porte_empresa) {
		this.porte_empresa = porte_empresa;
	}
	public String getCnae_empresa() {
		return cnae_empresa;
	}
	public void setCnae_empresa(String cnae_empresa) {
		this.cnae_empresa = cnae_empresa;
	}
	public String getRazao_social_empresa() {
		return razao_social_empresa;
	}
	public void setRazao_social_empresa(String razao_social_empresa) {
		this.razao_social_empresa = razao_social_empresa;
	}
	public String getCap_social_empresa() {
		return cap_social_empresa;
	}
	public void setCap_social_empresa(String cap_social_empresa) {
		this.cap_social_empresa = cap_social_empresa;
	}
	public String getSituacao_empresa() {
		return situacao_empresa;
	}
	public void setSituacao_empresa(String situacao_empresa) {
		this.situacao_empresa = situacao_empresa;
	}
	public String getEmail_empresa() {
		return email_empresa;
	}
	public void setEmail_empresa(String email_empresa) {
		this.email_empresa = email_empresa;
	}
	public String getNatureza_juridica() {
		return natureza_juridica;
	}
	public void setNatureza_juridica(String natureza_juridica) {
		this.natureza_juridica = natureza_juridica;
	}
	public String getData_abertura_empresa() {
		return data_abertura_empresa;
	}
	public void setData_abertura_empresa(String data_abertura_empresa) {
		this.data_abertura_empresa = data_abertura_empresa;
	}
	public double getValor_emprestimo() {
		return valor_emprestimo;
	}
	public void setValor_emprestimo(double valor_emprestimo) {
		this.valor_emprestimo = valor_emprestimo;
	}
	public double getParcelas() {
		return parcelas;
	}
	public void setParcelas(double parcelas) {
		this.parcelas = parcelas;
	}
	public double getValor_parcela() {
		return valor_parcela;
	}
	public void setValor_parcela(double valor_parcela) {
		this.valor_parcela = valor_parcela;
	}
	public Date getData_inicio() {
		return data_inicio;
	}
	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}
	public double getTaxa_juros() {
		return taxa_juros;
	}
	public void setTaxa_juros(double taxa_juros) {
		this.taxa_juros = taxa_juros;
	}
	public double getCet() {
		return cet;
	}
	public void setCet(double cet) {
		this.cet = cet;
	}
	public String getTipo_recebimento() {
		return tipo_recebimento;
	}
	public void setTipo_recebimento(String tipo_recebimento) {
		this.tipo_recebimento = tipo_recebimento;
	}
	public Date getData_primero_pgt() {
		return data_primero_pgt;
	}
	public void setData_primero_pgt(Date data_primero_pgt) {
		this.data_primero_pgt = data_primero_pgt;
	}
	public long getNumero_contrato() {
		return Numero_contrato;
	}
	public void setNumero_contrato(long numero_contrato) {
		Numero_contrato = numero_contrato;
	}
	public String getChave_baixa_parcela() {
		return Chave_baixa_parcela;
	}
	public void setChave_baixa_parcela(String chave_baixa_parcela) {
		Chave_baixa_parcela = chave_baixa_parcela;
	}
	public String getChave() {
		return Chave;
	}
	public void setChave(String chave) {
		Chave = chave;
	}
	public long getOrdem_parcela() {
		return ordem_parcela;
	}
	public void setOrdem_parcela(long ordem_parcela) {
		this.ordem_parcela = ordem_parcela;
	}
	public Date getData_vencimento() {
		return data_vencimento;
	}
	public void setData_vencimento(Date data_vencimento) {
		this.data_vencimento = data_vencimento;
	}
	public String getDias_em_atraso() {
		return dias_em_atraso;
	}
	public void setDias_em_atraso(String dias_em_atraso) {
		this.dias_em_atraso = dias_em_atraso;
	}
	public String getDia_da_semana() {
		return dia_da_semana;
	}
	public void setDia_da_semana(String dia_da_semana) {
		this.dia_da_semana = dia_da_semana;
	}
	public double getValor_parcela_atualizado() {
		return Valor_parcela_atualizado;
	}
	public void setValor_parcela_atualizado(double valor_parcela_atualizado) {
		Valor_parcela_atualizado = valor_parcela_atualizado;
	}
	public double getValor_pago_pelo_cliente() {
		return valor_pago_pelo_cliente;
	}
	public void setValor_pago_pelo_cliente(double valor_pago_pelo_cliente) {
		this.valor_pago_pelo_cliente = valor_pago_pelo_cliente;
	}
	public Date getData_de_pagamento() {
		return data_de_pagamento;
	}
	public void setData_de_pagamento(Date data_de_pagamento) {
		this.data_de_pagamento = data_de_pagamento;
	}
	public String getHouve_recebimento() {
		return houve_recebimento;
	}
	public void setHouve_recebimento(String houve_recebimento) {
		this.houve_recebimento = houve_recebimento;
	}
	public double getCc_credito() {
		return cc_credito;
	}
	public void setCc_credito(double cc_credito) {
		this.cc_credito = cc_credito;
	}
	public double getCc_debito() {
		return cc_debito;
	}
	public void setCc_debito(double cc_debito) {
		this.cc_debito = cc_debito;
	}
	public double getSaldo_corrente() {
		return saldo_corrente;
	}
	public void setSaldo_corrente(double saldo_corrente) {
		this.saldo_corrente = saldo_corrente;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getSituacao() {
		return Situacao;
	}
	public void setSituacao(String situacao) {
		Situacao = situacao;
	}
	public String getRota() {
		return rota;
	}
	public void setRota(String rota) {
		this.rota = rota;
	}
	public String getOperacao() {
		return operacao;
	}
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	public String getLucro_Esperado() {
		return Lucro_Esperado;
	}
	public void setLucro_Esperado(String lucro_Esperado) {
		Lucro_Esperado = lucro_Esperado;
	}
	public String getTipo_pagamento() {
		return Tipo_pagamento;
	}
	public void setTipo_pagamento(String tipo_pagamento) {
		Tipo_pagamento = tipo_pagamento;
	}
	public double getLucro_Por_Parcela() {
		return Lucro_Por_Parcela;
	}
	public void setLucro_Por_Parcela(double lucro_Por_Parcela) {
		Lucro_Por_Parcela = lucro_Por_Parcela;
	}
	public double getValor_disponibilizado() {
		return valor_disponibilizado;
	}
	public void setValor_disponibilizado(double valor_disponibilizado) {
		this.valor_disponibilizado = valor_disponibilizado;
	}
	public String getAgente_Cobranca() {
		return Agente_Cobranca;
	}
	public void setAgente_Cobranca(String agente_Cobranca) {
		Agente_Cobranca = agente_Cobranca;
	}
	public String getAprovacao_pagamento() {
		return aprovacao_pagamento;
	}
	public void setAprovacao_pagamento(String aprovacao_pagamento) {
		this.aprovacao_pagamento = aprovacao_pagamento;
	}
	
	
	
	

}
