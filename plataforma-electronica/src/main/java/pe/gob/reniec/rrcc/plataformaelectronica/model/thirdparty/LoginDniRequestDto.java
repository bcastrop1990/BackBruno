package pe.gob.reniec.rrcc.plataformaelectronica.model.thirdparty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginDniRequestDto {
  private String coUsuario;
  private String clave;
  private String coAplicativo;
  private String ip;
}
