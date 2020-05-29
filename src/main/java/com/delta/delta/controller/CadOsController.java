package com.delta.delta.controller;

import com.delta.delta.bean.Aparelho;
import com.delta.delta.bean.Cliente;
import com.delta.delta.dao.AparelhoDAO;
import com.delta.delta.dao.ClienteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;

@RestController
public class CadOsController {

    @Autowired
    private ClienteDAO clienteDAO;
    @Autowired
    private AparelhoDAO aparelhoDAO;
    @RequestMapping(value="cadClient",consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public void  cadCliente(){
        Cliente c = new Cliente();
        c.setNome("Joao da Silva");
        c.setEmail("joao.silva@gmail.com");
        c.setEndereco("vasconcelos 34");
        c.setTelefone("(51)98204-0011");
        clienteDAO.save(c);
    }

    @RequestMapping(value="list",produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    private Iterator<Cliente> findAll(){
        return clienteDAO.findAll().iterator();
    }
    @RequestMapping(value="listAparelho",produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    private Iterator<Aparelho> findAllAparelho(){
        return aparelhoDAO.findAll().iterator();
    }


}
