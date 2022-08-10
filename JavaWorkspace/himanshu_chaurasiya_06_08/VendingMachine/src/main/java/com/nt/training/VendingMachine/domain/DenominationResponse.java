package com.nt.training.VendingMachine.domain;

public class DenominationResponse {		
		private int denomKey;
		private Integer denomValue;
		public int getDenomKey() {
			return denomKey;
		}
		public void setDenomKey(int denomKey) {
			this.denomKey = denomKey;
		}
		public Integer getDenomValue() {
			return denomValue;
		}
		public void setDenomValue(Integer denomValue) {
			this.denomValue = denomValue;
		}
		@Override
		public String toString() {
			return "denomResponse [denomKey=" + denomKey + ", denomValue=" + denomValue + "]";
		}
		public DenominationResponse(int notes, Integer denomValue) {
			super();
			this.denomKey = notes;
			this.denomValue = denomValue;
		}
		public DenominationResponse() {
			super();
			// TODO Auto-generated constructor stub
		}

}
