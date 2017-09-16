package com.indus.training.service;

public   class Lock {
	private String lockname;

	public Lock(String lockname) {
		super();
		this.lockname = lockname;
	}

	public Key getLockKey(String keyname) {
		return new Key(keyname);

	}
	/*public static GblKey getGblLockKey(){
		return new GblKey();
	}*/
	@Override
	public String toString() {
		return "Lock [lockname=" + lockname + "]";
	}
	

	public static class Key {
		private String keyName;

		public  Key(String keyName) {
			super();
			this.keyName = keyName;
		}

		@Override
		public String toString() {
			return "key [keyName=" + keyName + "]";
		}

	}
}
/*public static class GblKey{}

	

}*/
