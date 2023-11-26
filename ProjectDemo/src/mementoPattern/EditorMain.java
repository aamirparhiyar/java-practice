package mementoPattern;

public class EditorMain {

	public static void main(String[] args) {
		Editor editor = new Editor();
		HIstory hIstory = new HIstory();
		editor.setContent("A");
		hIstory.push(new EditorState(editor.getContent()));
		editor.setContent("B");
		hIstory.push(new EditorState(editor.getContent()));
		editor.setContent("C");
		editor.restore(hIstory.pop());
		
		System.out.println(editor.getContent());

	}

}
