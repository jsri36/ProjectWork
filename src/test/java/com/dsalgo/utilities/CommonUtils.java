package com.dsalgo.utilities;

import java.io.IOException;
import java.util.Properties;

import com.dsalgo.constants.Constants;

public class CommonUtils {
	
	
	public  void loadProperties() {
		
		Properties properties=new Properties();
		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Constants.APP_URL= properties.getProperty("APP_URL");
		Constants.BROWSER=properties.getProperty("BROWSER");
		Constants.URL= properties.getProperty("url");
		Constants.Browser2=properties.getProperty("browser");
		Constants.HomePageUrl= properties.getProperty("homepageurl");
		Constants.RegisterPageUrl=properties.getProperty("registerpageurl");
		Constants.SiginPageUrl= properties.getProperty("signinpageurl");
		Constants.TreePageUrl=properties.getProperty("treepageurl");
		Constants.ActualHomeTitle=properties.getProperty("ActualHomeTitle");
		Constants.ActWarnMsg=properties.getProperty("ActWarnMsg");
		Constants.ActErrorMsg1=properties.getProperty("ActErrorMsg1");
		Constants.ActErrorMsg2=properties.getProperty("ActErrorMsg2");
		Constants.ActErrorMsg3=properties.getProperty("ActErrorMsg3");
		Constants.ActErrorMsg4=properties.getProperty("ActErrorMsg4");
		Constants.ActErrorMsg5=properties.getProperty("ActErrorMsg5");
		Constants.ActErrorMsg6=properties.getProperty("ActErrorMsg6");
		Constants.ActSuccessMsg1=properties.getProperty("ActSuccessMsg1");
		Constants.ActSuccessMsg2=properties.getProperty("ActSuccessMsg2");
		Constants.ActErrorMsg7=properties.getProperty("ActErrorMsg7");
		Constants.Excelpath=properties.getProperty("Excelpath");
		Constants.ActualErrMsg=properties.getProperty("ActualErrMsg");
		Constants.ActOverviewOfTreesURL=properties.getProperty("ActOverviewOfTreesURL");
		Constants.ActTerminologiesURL=properties.getProperty("ActTerminologiesURL");
		Constants.ActTypesOfTreesURL=properties.getProperty("ActTypesOfTreesURL");
		Constants.ActTreeTraversalsURL=properties.getProperty("ActTreeTraversalsURL");
		Constants.ActTraversalsIllustrationURL=properties.getProperty("ActTraversalsIllustrationURL");
		Constants.ActBinaryTreesURL=properties.getProperty("ActBinaryTreesURL");
		Constants.ActTypesOfBinaryTreesURL=properties.getProperty("ActTypesOfBinaryTreesURL");
		Constants.ActImplementationInPythonURL=properties.getProperty("ActImplementationInPythonURL");
		Constants.ActBinaryTreeTraversalsURL=properties.getProperty("ActBinaryTreeTraversalsURL");
		Constants.ActImplementationofBinaryTreesURL=properties.getProperty("ActImplementationofBinaryTreesURL");
		Constants.ActApplicationsofBinaryTreesURL=properties.getProperty("ActApplicationsofBinaryTreesURL");
		Constants.ActBinarySearchTreesURL=properties.getProperty("ActBinarySearchTreesURL");
		Constants.ActImplementationOfBSTURL=properties.getProperty("ActImplementationOfBSTURL");
		Constants.ActPracticeQuestionsURL=properties.getProperty("ActPracticeQuestionsURL");
		Constants.ActTryEditorPgURL=properties.getProperty("ActTryEditorPgURL");
		Constants.ActualOutputMsg=properties.getProperty("ActualOutputMsg");
		Constants.REGISTER=properties.getProperty("REGISTER");
		Constants.SIGNIN=properties.getProperty("SIGNIN");
		
		Constants.STACK=properties.getProperty("STACK");
		Constants.STACK_APP=properties.getProperty("STACK_APP");
		Constants.QUEUE=properties.getProperty("QUEUE");
		Constants.QUEUE_OP=properties.getProperty("QUEUE_OP");
		Constants.DataStructuresURL=properties.getProperty("DataStructuresURL");
		Constants.TimeComplexityURL=properties.getProperty("TimeComplexityURL");
		Constants.Graphurl=properties.getProperty("Graphurl");
		Constants.GraphRepresentationURL=properties.getProperty("GraphRepresentationURL");
		
			
		}
		
		}

	
