@Entity
public class Mensagem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDateTime horario;
    private String remetente;
    private String mensagem;

protected Mensagem() {}

public Mensagem(LocalDateTime horario, String remetente, String mensagem) {
        this.horario = horario;
        this.remetente = remetente;
        this.mensagem = mensagem;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public String getRemetente() {
        return remetente;
    }

    public String getMensagem() {
        return mensagem;
    }
}