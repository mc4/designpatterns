package designpatterns.creational.factory;

public class CloudFactory {
	public static Cloud getCloud(final String cloudType) {
		return switch (cloudType) {
			case "Cirrus" -> new Cirrus();
			case "Cumulus" -> new Cumulus();
			case "Nimbus" -> new Nimbus();
			default -> throw new IllegalArgumentException("Unexpected cloud type: " + cloudType);
		};
	}
}
