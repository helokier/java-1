class MenuDemo extends JFrame 
{
    private JMenuBar menuBar;
    private JMenu mainMenu, helpMenu;
    private JMenuItem login,logout,exit, edit, view, about;    
    private JPanel mainPanel;
    private JMenuItem createMenuItem(String name){
        JMenuItem menuItem=new JMenuItem(name);
        return menuItem;
    }
    
    private void createMenu(){
        login=createMenuItem("Login"); 
        logout=createMenuItem("Logout");
        exit=createMenuItem("Exit");
        edit=createMenuItem("Edit");
        view=createMenuItem("View");
        about=createMenuItem("About");
        menuBar = new JMenuBar();
        mainMenu = new JMenu("File");
        helpMenu = new JMenu("Help");
        menuBar.add(mainMenu);
        menuBar.add(helpMenu);        
        mainMenu.add(login); 
        mainMenu.add(logout); 
        mainMenu.add(edit); 
        mainMenu.add(view); 
        mainMenu.add(exit); 
        helpMenu.add(about); 
        setJMenuBar(menuBar);
    }

    public MenuDemo()
    {
        mainPanel =new JPanel(new GridLayout(5,1,2,2));
        createMenu();
        setContentPane(mainPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("EditPlus");
        pack();
    }
    
    public static void main(String[] args) 
    {
        MenuDemo s=new MenuDemo(); s.pack();
        s.show();
    }
}