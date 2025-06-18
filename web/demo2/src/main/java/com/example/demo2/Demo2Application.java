package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import main.java.com.example.demo2.Mensagem;

@SpringBootApplication
@RestController
public class Demo2Application {
	@Autowired
	private MensagemRepository mensagemRepository;

	@PostMapping("/chat")
	public void enviarMensagem(@RequestBody Mensagem mensagem) {
		mensagemRepository.save(mensagem);
	}

	@GetMapping("/chat")
	public Iterable<Mensagem> obterMensagens() {
		return mensagemRepository.findAll();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}
}