package br.eti.krebscode.springboottest.repository;

import org.springframework.data.repository.CrudRepository;

import br.eti.krebscode.springboottest.entity.Invited;

public interface InvitedRepository extends CrudRepository<Invited, Long> {

}
