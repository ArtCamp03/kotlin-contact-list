package com.everis.listadecontatos.feature.listacontatos.model.viewmodel;

import com.everis.listadecontatos.application.ContatoApplication;
import com.everis.listadecontatos.feature.listacontatos.model.ContatosVO;
import kotlin.Unit;

import java.util.List;

import static sun.jvm.hotspot.runtime.PerfMemory.start;

public class ListadeContatosViewModel {

    fun getListaDeContatos(
            busca: String,
            onSucesso: ((List<ContatosVO> -> Unit)),
            onError: ((Fxception -> Unit)),
    ){

        Thread(Runnable {
            Thread.sleep(1500)
            var listaFiltrada: List<ContatosVO> = mutableListOf()
            try {
                listaFiltrada = ContatoApplication.instance.helperDB?.buscarContatos(busca) ?: mutableListOf()
            }catch (ex: Exception){
                ex.printStackTrace()
            }
            onSucesso(listaFiltrada)
        }).start()
    }
}
