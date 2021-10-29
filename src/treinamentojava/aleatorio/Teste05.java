package treinamentojava.aleatorio;

//@Component
public class Teste05 {

//	public static void main(String[] args) {
//
//		Teste05 teste05 = new Teste05();
//		
//		String str = teste05.getString("ENV_PREFIXO", "stringqualquer");
//		System.out.println(str);
//		
//		String str2 = teste05.getString("DATABASE_NAME", "stringqualquer2");
//		System.out.println(str2);
//		
//		String str3 = teste05.getString("MAIL_REMETENTE_NOME", "stringqualquer3");
//		System.out.println(str3);				
//	}
//
//	private static final String FILE_DEFAULT = "config.properties";
//	private static final String FILE_REPLACE = "config.replace.properties";
//
//	private final Properties PROPERTIES;
//	private final String PREFIXO;
//
//	public Teste05() {
//
//		try {
//
//			List<Properties> list = loadAllResources(FILE_DEFAULT);
//			List<Properties> listSpecific = loadAllResources(FILE_REPLACE);
//			sortResources(list);
//			sortResources(listSpecific);
//			PROPERTIES = new Properties();
//			for (Properties properties : list) {
//				for (Object keyDefault : properties.keySet()) {
//
//					Object keyReplaceToPut = null;
//					Object keyValueReplaceToPut = null;
//					boolean keyReplaceEncontrado = false;
//					for (Properties propertiesReplace : listSpecific) {
//
//						for (Object keyReplace : propertiesReplace.keySet()) {
//
//							if (keyDefault.equals(keyReplace)) {
//
//								keyReplaceToPut = keyReplace;
//								keyValueReplaceToPut = propertiesReplace.get(keyReplace);
//								keyReplaceEncontrado = true;
//								break;
//							}
//						}
//
//						if (keyReplaceEncontrado) {
//							break;
//						}
//					}
//
//					if (keyReplaceEncontrado) {
//						PROPERTIES.put(keyReplaceToPut, keyValueReplaceToPut);
//					} else {
//						PROPERTIES.put(keyDefault, properties.get(keyDefault));
//					}
//				}
//			}
//
//		} catch (IOException ex) {
//			throw new RuntimeException(ex);
//		}
//
//		PREFIXO = PROPERTIES.getProperty("ENV_PREFIXO");
//	}
//
//	private static void sortResources(List<Properties> list) {
//
//		if (list == null || list.isEmpty()) {
//			return;
//		}
//
//		list.sort(Comparator.comparing(p -> {
//			String priority = p.getProperty("CONFIG_PRIORITY");
//			return ((priority == null) ? null : Integer.parseInt(priority));
//		}, nullsLast(reverseOrder())));
//	}
//
//	private static List<Properties> loadAllResources(String resourceName) throws IOException {
//		List<Properties> list = new ArrayList<>();
//		Enumeration<URL> resources = Teste05.class.getClassLoader().getResources(resourceName);
//
//		while (resources.hasMoreElements()) {
//			URL url = resources.nextElement();
//			Properties properties = new Properties();
//			properties.load(url.openStream());
//			list.add(properties);
//		}
//		return list;
//	}
//
//	public Integer getInt(String key, Integer defaultValue) {
//		return getProperty(key, defaultValue, Integer::valueOf);
//	}
//
//	public Boolean getBoolean(String key, Boolean defaultValue) {
//		return getProperty(key, defaultValue, Boolean::valueOf);
//	}
//
//	public Float getFloat(String key, Float defaultValue) {
//		return getProperty(key, defaultValue, Float::valueOf);
//	}
//
//	public Double getDouble(String key, Double defaultValue) {
//		return getProperty(key, defaultValue, Double::valueOf);
//	}
//
//	public BigDecimal getBigDecimal(String key, BigDecimal defaultValue) {
//		return getProperty(key, defaultValue, BigDecimal::new);
//	}
//
//	public Character getCharacter(String key, Character defaultValue) {
//		return getProperty(key, defaultValue, s -> s.charAt(0));
//	}
//
//	public <E extends Enum<E>> E getEnum(String key, E defaultValue, Class<E> enumType) {
//		return getProperty(key, defaultValue, name -> Enum.valueOf(enumType, name));
//	}
//
//	public String getString(String key, String defaultValue) {
//		return getProperty(key, defaultValue, identity());
//	}
//
//	public <R> R getProperty(String key, R defaultValue, Function<String, R> parser) {
//		return getProperty(((PREFIXO == null) ? key : (PREFIXO + key)), key, defaultValue, parser);
//	}
//
//	public <R> R getProperty(String key, String defaultKey, R defaultValue, Function<String, R> parser) {
//		String value = System.getenv(key);
//		if ((value == null) && (defaultValue != null)) {
//			value = System.getenv(defaultKey);
//		}
//		if ((value == null) && (defaultKey != null)) {
//			value = System.getProperty(defaultKey);
//		}
//		if ((value == null) && (defaultKey != null)) {
//			value = PROPERTIES.getProperty(defaultKey);
//		}
//		if (value == null) {
//			return defaultValue;
//		}
//		return parser.apply(value);
//	}
//
//	public Properties getEmailConfig() {
//		Properties emailConfig = new Properties();
//		emailConfig.setProperty("login", getString("MAIL_LOGIN", ""));
//		emailConfig.setProperty("senha", getString("MAIL_SENHA", ""));
//		emailConfig.setProperty("remetente.nome", getString("MAIL_REMETENTE_NOME", "No reply"));
//		emailConfig.setProperty("remetente.email", getString("MAIL_REMETENTE_EMAIL", "noreply@saude.pe.gov.br"));
//		emailConfig.setProperty("mail.smtp.host", getString("MAIL_SMTP_HOST", "localhost"));
//		emailConfig.setProperty("mail.smtp.auth", getString("MAIL_SMTP_AUTH", "false"));
//		emailConfig.setProperty("mail.debug", getString("MAIL_DEBUG", "false"));
//		emailConfig.setProperty("mail.smtp.debug", getString("MAIL_SMTP_DEBUG", "false"));
//		emailConfig.setProperty("mail.mime.charset", getString("MAIL_MIME_CHARSET", "UTF-8"));
//		emailConfig.setProperty("mail.smtp.port", getString("MAIL_SMTP_PORT", "25"));
//		return emailConfig;
//	}

}
