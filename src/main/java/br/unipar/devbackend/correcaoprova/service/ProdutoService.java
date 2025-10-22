package br.unipar.devbackend.correcaoprova.service;

import br.unipar.devbackend.correcaoprova.model.Produto;
import br.unipar.devbackend.correcaoprova.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

}
