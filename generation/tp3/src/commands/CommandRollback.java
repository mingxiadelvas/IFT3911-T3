package commands;
public interface CommandRollback {

	void undo();

	void redo();

}