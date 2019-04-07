import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;

public class test_hello_world_git extends Shell {
	private Composite composite;
	private TabFolder tabFolder;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String args[]) {
		try {    
			Display display = Display.getDefault();
			test_hello_world_git shell = new test_hello_world_git(display);
			shell.open();
			shell.layout();
			while (!shell.isDisposed()) {
				if (!display.readAndDispatch()) {
					display.sleep();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the shell.
	 * @param display
	 */
	public test_hello_world_git(Display display) {
		super(display, SWT.SHELL_TRIM);
		createContents();
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("SWT Application");
		setSize(450, 300);

		
		composite = new Composite(this, SWT.NONE);
		composite.setBounds(116, 10, 64, 64);
		
		tabFolder = new TabFolder(this, SWT.NONE);
		tabFolder.setBounds(209, 39, 147, 52);
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
