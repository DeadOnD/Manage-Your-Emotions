package com.thilo.android.FeelingsManager.Main;

public interface MainActivityCallbackListenerI {
	public void fireSavePatternEvent();
	public void fireUpdateTabTitlesEvent();
	public void fireResetDataEvent();
	public void fireClearDatabaseAndUpdateGuiEvent();
}
