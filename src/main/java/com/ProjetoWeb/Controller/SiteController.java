/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProjetoWeb.Controller;


import com.ProjetoWeb.Cookie.model.Preferencias;
import com.ProjetoWeb.Models.Cardapio;
import com.ProjetoWeb.Models.Pedido;
import com.ProjetoWeb.Repository.CardapioRepository;
import com.ProjetoWeb.Repository.PedidoRepository;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 * @author mathe
 */
@Controller
public class SiteController {
    @Autowired
    private PedidoRepository pr;
    
    @Autowired
    private CardapioRepository cr;
    
    
    @RequestMapping("/Home") 
        public String home(){
        return "Home"; 
    }
    @RequestMapping(value="/Pedido-Cadastrar", method=RequestMethod.GET) 
        public String PedidoCadastrar(){
        return "Pedido"; 
    }
    @RequestMapping(value="/Pedido-Cadastrar", method=RequestMethod.POST) 
        public String PedidoCadastrar(Pedido Pedido){
        pr.save(Pedido);
        return "redirect:/Pedido-Cadastrar"; 
        }
    @RequestMapping("/Cardapio") 
        public ModelAndView Cardapio(){
        ModelAndView mv = new ModelAndView("Cardapio");
        Iterable<Cardapio> cardapio = cr.findAll();
        mv.addObject("cardapio", cardapio);
        return mv; 
        }
    @RequestMapping("/Pedido-Listar") 
        public ModelAndView PedidoListar(){
        ModelAndView lv = new ModelAndView("Lista-Pedidos");
        Iterable<Pedido> pedido = pr.findAll();
        lv.addObject("pedido", pedido);
        return lv; 
    }
}

