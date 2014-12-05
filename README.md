business-validation
===================

Validation d'objets métiers selon la JSR-303.

Cet artifact est en construction.

Basé sur l'API Bval d'apache.
Les validateurs de bval-extra sont natifs (http://bval.apache.org/mvnsite/bval-extras/apidocs/index.html).

Les validateurs suivants sont opérationnels:

```Java
	
	// validation d'email selon la RFC 3696
	@Email
	private String email;

	// Validation de n° Siren
	@Siren
	private String siren;


	// Validation de n° Siret
	@Siret
	private String siret;
	

	// Validation de n° NIC (Insee ou securité sociale)
	// controle de :
	//   - pattern par regex
	//	 - la clé de contrôle
	// 	 - validité des communes (mais pas encore couplé à l'année et au mois)
	@NIR
	private String nir;
	
    // Validation de codes postaux Français
    @CodePostalFr
    private String codepostal;
    
    // Validation de codes postaux Belge
    @CodePostalBe
    private String codepostal;
    
    // override from BCEL extra
    @AmericanExpress
    @IBAN
    @Mastercard
    @Visa
    @EAN13
    @Luhn
    
    
    
```