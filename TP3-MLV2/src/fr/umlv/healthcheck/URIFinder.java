package fr.umlv.healthcheck;

import java.net.URI;
import java.util.Optional;

@FunctionalInterface
public interface URIFinder {
	public Optional<URI> find();
}
