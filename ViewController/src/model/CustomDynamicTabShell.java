package model;

import javax.faces.event.ActionEvent;

import oracle.ui.pattern.dynamicShell.TabContext;

public class CustomDynamicTabShell {
    private int count;

    public void addEmpTF(ActionEvent ae) {
        count++;
        try {
            TabContext.getCurrentInstance().addTab("Employee TaskFlow " +
                                                   count,
                                                   "/WEB-INF/Emp-flow-definition.xml#Emp-flow-definition");
        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }
    }

    public void addOrSelectEmpTF(ActionEvent ae) {
        try {
            TabContext.getCurrentInstance().addOrSelectTab("Employee TaskFlow 2",
                                                           "/WEB-INF/Emp-flow-definition.xml#Emp-flow-definition");
        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }
    }


    public void addDeptTF(ActionEvent ae) {
        ++count;
        try {
            TabContext.getCurrentInstance().addTab("Dept TaskFlow " + count,
                                                   "/WEB-INF/Dept-flow-definition.xml#Dept-flow-definition");
        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }
    }

    public void addOrSelectDeptTF(ActionEvent ae) {
        try {
            TabContext.getCurrentInstance().addOrSelectTab("Dept TaskFlow 3",
                                                           "/WEB-INF/Dept-flow-definition.xml#Dept-flow-definition");
        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }
    }
    
    
    public void multipleInstanceActivity(ActionEvent actionEvent) 
      { 
        /** 
        * Example method when called repeatedly, will open another instance as 
        * oppose to selecting a previously opened tab instance. Note the boolean 
        * to create another tab instance is set to true. 
        */ 
          
        _launchActivity( 
          "A New Activity", 
          "/WEB-INF/flows/new.xml#new", 
          true); 
      } 
      
      public void launchFirstActivity(ActionEvent actionEvent) 
      { 
          /** 
          * Example method to call a single instance task flow. Note the boolean 
          * to create another tab instance is set to false. The taskflow ID is used 
          * to track whether to create a new tab or select an existing one. 
          */ 
        _launchActivity( 
          "The First Activity", 
          "/WEB-INF/flows/first.xml#first", 
          false); 
      } 
      
      public void launchSecondActivity(ActionEvent actionEvent) 
      { 
        _launchActivity( 
          "Next Activity", 
          "/WEB-INF/flows/second.xml#second", 
          false); 
      } 
      
      public void launchThirdActivity(ActionEvent actionEvent) 
      { 
        _launchActivity( 
          "Third Activity", 
          "/WEB-INF/flows/third.xml#third", 
          false); 
      } 
      
      public void closeCurrentActivity(ActionEvent actionEvent) 
      { 
        TabContext tabContext = TabContext.getCurrentInstance(); 
        int tabIndex = tabContext.getSelectedTabIndex(); 
        if (tabIndex != -1) 
        { 
          tabContext.removeTab(tabIndex); 
        } 
      } 
      
        public void currentTabDirty(ActionEvent e) 
        { 
            /** 
            * When called, marks the current tab "dirty". Only at the View level 
            * is it possible to mark a tab dirty since the model level does not 
            * track to which tab data belongs. 
            */ 
          TabContext tabContext = TabContext.getCurrentInstance(); 
          tabContext.markCurrentTabDirty(true); 
        }  
      
        public void currentTabClean(ActionEvent e) 
        { 
          TabContext tabContext = TabContext.getCurrentInstance(); 
          tabContext.markCurrentTabDirty(false); 
        } 
           
      private void _launchActivity(String title, String taskflowId, boolean newTab) 
      { 
        try 
        { 
          if (newTab) 
          { 
            TabContext.getCurrentInstance().addTab( 
              title, 
              taskflowId); 
          } 
          else 
          { 
            TabContext.getCurrentInstance().addOrSelectTab( 
              title, 
              taskflowId); 
          } 
        } 
        catch (TabContext.TabOverflowException toe) 
        { 
          // causes a dialog to be displayed to the user saying that there are 
          // too many tabs open - the new tab will not be opened... 
          toe.handleDefault();  
        } 
      } 

        public void launchFirstReplaceNPlace(ActionEvent actionEvent) 
        { 
          TabContext tabContext = TabContext.getCurrentInstance(); 
          try 
          { 
            tabContext.setMainContent("/WEB-INF/flows/first.xml#first"); 
          } 
          catch (TabContext.TabContentAreaDirtyException toe) 
          { 
              // TODO: warn user TabContext api needed for this use case. 
          } 
        } 

        public void launchSecondReplaceNPlace(ActionEvent actionEvent) 
        { 
          TabContext tabContext = TabContext.getCurrentInstance(); 
          try 
          { 
            tabContext.setMainContent("/WEB-INF/flows/second.xml#second"); 
          } 
          catch (TabContext.TabContentAreaDirtyException toe) 
          { 
              // TODO: warn user TabContext api needed for this use case.          
          } 
        } 
    
}
