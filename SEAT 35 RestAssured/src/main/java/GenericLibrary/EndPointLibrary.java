package GenericLibrary;
/**
 *  This interface constins all the endpoints
 * @author indir
 *
 */
public interface EndPointLibrary {
	
	String CreateProject = "/addProject";
	String GetProjects = "/projects";
	String UpdateProject = "/projects/";
	String DeleteProject = "/projects/";
	String GetSingleProject = "/projects/{pid}";


}
