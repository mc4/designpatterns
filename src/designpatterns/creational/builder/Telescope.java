package designpatterns.creational.builder;

public class Telescope {

	// required parameters
	private String opticalTube;
	private String lens;
	private String finderScope;

	// optional parameters
	private String focuser;
	private String tripod;
	private String mount;

	public void setOpticalTube(String opticalTube) {
		this.opticalTube = opticalTube;
	}

	public void setLens(String lens) {
		this.lens = lens;
	}

	public void setFinderScope(String finderScope) {
		this.finderScope = finderScope;
	}

	public void setFocuser(String focuser) {
		this.focuser = focuser;
	}

	public void setTripod(String tripod) {
		this.tripod = tripod;
	}

	public void setMount(String mount) {
		this.mount = mount;
	}

	private Telescope(Builder builder) {
		this.opticalTube = builder.opticalTube;
		this.lens = builder.lens;
		this.finderScope = builder.finderScope;
		this.focuser = builder.focuser;
		this.tripod = builder.tripod;
		this.mount = builder.mount;
	}

	public static class Builder {
		// required parameters
		private String opticalTube;
		private String lens;
		private String finderScope;

		// optional parameters
		private String focuser;
		private String tripod;
		private String mount;

		public Builder(String opticalTube, String lens, String finderScope) {
			this.opticalTube = opticalTube;
			this.lens = lens;
			this.finderScope = finderScope;
		}

		public Builder setFocuser(String focuser) {
			this.focuser = focuser;
			return this;
		}

		public Builder setTripod(String tripod) {
			this.tripod = tripod;
			return this;
		}

		public Builder setMount(String mount) {
			this.mount = mount;
			return this;
		}

		public Telescope build() {
			return new Telescope(this);
		}

	}

}
