business-validation
===================

Validation d'objets métiers selon la JSR-303.

Cet artifact est en construction.

Basé sur l'API Bval d'apache.
Les validateurs de bval-extra sont natifs (http://bval.apache.org/mvnsite/bval-extras/apidocs/index.html).

Les validateurs suivants sont opérationnels:

```Java
	
	// validation d'email selon la RFC 
	@Email
	private String email;

	// Validation de n° Siren
	@Siren
	private String siren;


	// Validation de n° Siret
	@Siret
	private String siret;
	

	// Validation de n° NIC (Insee ou securité sociale)
	// controle le pattern par regex, la clé de contrôle et les communes (pas encore selon la date du NIR)
	@NIR
	private String nir;
```