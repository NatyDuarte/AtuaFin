package br.com.atuafinanceira.atuafinanceira.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.atuafinanceira.atuafinanceira.model.Fenix;

@Repository
public interface FenixRepositorio extends JpaRepository<Fenix, Long>{
	
	public List<Fenix> findAllByNomeContainingIgnoreCase(String nome_cliente);
	
	
	
	
}
