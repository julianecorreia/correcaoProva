package br.unipar.devbackend.correcaoprova.controller;

import br.unipar.devbackend.correcaoprova.model.Produto;
import br.unipar.devbackend.correcaoprova.service.ProdutoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public List<Produto> findAll() {
        return produtoService.findAll();
    }

}
