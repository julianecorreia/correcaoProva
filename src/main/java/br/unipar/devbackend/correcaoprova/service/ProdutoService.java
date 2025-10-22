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

    public Produto findById(Long id) {
        return produtoRepository.findById(id).orElse(null);
    }

    public Produto create(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Produto edit(Long id, Produto produto) {
        Produto produtoExistente = findById(id);
        if (produtoExistente != null) {
            produtoExistente.setNome(produto.getNome());
            produtoExistente.setPreco(produto.getPreco());
            return produtoRepository.save(produtoExistente);
        }
        return null;
    }

    public Boolean delete(Long id) {
        Produto produtoExistente = findById(id);
        if (produtoExistente != null) {
            produtoRepository.delete(produtoExistente);
            return true;
        }
        return false;
    }
}
