package Agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Agenda.model.Agenda;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda,Long>{
	
}
