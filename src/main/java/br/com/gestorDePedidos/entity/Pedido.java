package br.com.gestorDePedidos.entity;

import java.time.LocalDateTime;
import java.util.List;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pedido")
@Builder
@Data
public class Pedido {
    @Id
    private int codigoPedido;
    @DBRef
    private Cliente cliente;
    private float valorTotal;
    private LocalDateTime dataPedido;
    private List<Item> items;

}
