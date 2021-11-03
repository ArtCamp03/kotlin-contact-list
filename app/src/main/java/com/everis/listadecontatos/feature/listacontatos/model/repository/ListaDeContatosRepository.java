package com.everis.listadecontatos.feature.listacontatos.model.repository;

import com.everis.listadecontatos.feature.listacontatos.model.ContatosVO;
import kotlin.Unit;

import java.util.List;

public class ListaDeContatosRepository {
    fun requestListaDeContatos(
            busca: String
            onSucesso: ((List<ContatosVO> -> Unit)),
            onError: ((Fxception -> Unit)),
    ){

    }

}
