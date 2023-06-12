package test11;

public class Button {

	OnClickListener listener;
	
	public void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.OnClick();
	}
	
	static interface OnClickListener {
		void OnClick();
	}
}
