package pe.gob.reniec.rrcc.plataformaelectronica.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SegSolDetFirmaResponse {
  private String tipoSolicitud;
  private String numeroDocumento;
  private String primerApellido;
  private String segundoApellido;
  private String preNombres;
  private ArchivoResponse archivoRespuesta;
}
