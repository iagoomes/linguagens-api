    package br.com.iagoomes.linguagensApi;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.RequestBody;
    import org.springframework.web.bind.annotation.RestController;

    import java.util.List;

    @RestController
    public class LinguagemController {

        @Autowired
        private LinguagemRepository repository;

        @GetMapping(value= "/linguagens")
        public List<Linguagem> obterLinguagens() {
            List<Linguagem> linguagens = repository.findAll();
            return linguagens;
        }

        @PostMapping(value= "/linguagens")
        public Linguagem cadastrarLinguagem(@RequestBody Linguagem linguagem){
            Linguagem linguagemSalva = repository.save(linguagem);
            return linguagemSalva;
        }
    }
