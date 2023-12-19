package pe.gob.reniec.rrcc.plataformaelectronica.model.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class TipoSolicitudRegFirmaResponse {
  private Integer codigo;
  private String descripcion;
}
