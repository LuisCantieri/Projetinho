/*package com.sesi.projeto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sesi.projeto.entities.ItemDoPedido;
import com.sesi.projeto.repositories.ItemDoPedidoRepository;

@RestController
@RequestMapping("item")
public class ItemDoPedidoController {

    @Autowired
    private ItemDoPedidoRepository repo;

    // Método para listar todos os itens
    @GetMapping
    public ResponseEntity<List<ItemDoPedido>> mostrarTodos() {
        List<ItemDoPedido> itens = repo.findAll();
        return ResponseEntity.ok(itens);
    }

    // Método para buscar um item pelo ID
    @GetMapping(value = "/itemdopedido/{id}")
    public ResponseEntity<?> mostrarPorId(@PathVariable Long id) {
        return repo.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Método para criar um novo item
    @PostMapping
    public ResponseEntity<ItemDoPedido> criar(@RequestBody ItemDoPedido item) {
        ItemDoPedido novoItem = repo.save(item);
        return ResponseEntity.ok(novoItem);
    }

    @PutMapping(value = "/itemdopedido/{id}")
    public ResponseEntity<?> atualizar(@PathVariable Long id, @RequestBody ItemDoPedido itemAtualizado) {
        return repo.findById(id).map(item -> {
            
            item.setNome(itemAtualizado.getNome());

            
            ItemDoPedido itemSalvo = repo.save(item);
            return ResponseEntity.ok(itemSalvo);
        }).orElse(ResponseEntity.notFound().build());
    }

    
    @DeleteMapping(value = "/itemdopedido/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id) {
        return repo.findById(id).map(item -> {
            repo.delete(item);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
*/