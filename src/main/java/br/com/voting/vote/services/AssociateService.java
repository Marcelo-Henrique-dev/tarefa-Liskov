package br.com.voting.vote.services;

import br.com.voting.vote.dtos.AssociateDTO;
import br.com.voting.vote.models.Associate;

import java.util.List;

public interface AssociateService {
    void createAssociate(AssociateDTO associateDTO);

    List<Associate> findAll();

    Associate findById(Long id);

    void deleteAssociate(Long id);

    void updateAssociate(AssociateDTO associateDTO, Long id);
}