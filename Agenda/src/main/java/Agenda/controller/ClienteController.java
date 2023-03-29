package Agenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Agenda.model.Agenda;
import Agenda.repository.AgendaRepository;

@RestController
@RequestMapping("/agenda")
public class ClienteController {
	
	@Autowired
	private AgendaRepository ContatoRepository;
	
	@GetMapping
	public List<Agenda> contatos(){
		return ContatoRepository.findAll();
		
		
	}
	
	@PostMapping 
	@ResponseStatus(HttpStatus.CREATED)
	public Agenda adicionar(@RequestBody Agenda contato) {
		return ContatoRepository.save(contato);
	}
	
	@PostMapping(value ="/excluir")
	public void remover(@RequestBody Agenda contato) {
		ContatoRepository.delete(contato);
	}
	
	@PostMapping(value ="/modificar")
	public Agenda alterar(@RequestBody Agenda contato) {
		return ContatoRepository.saveAndFlush(contato);
	}
	
}
