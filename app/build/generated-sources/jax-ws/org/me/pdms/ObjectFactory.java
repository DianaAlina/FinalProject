
package org.me.pdms;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.me.pdms package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetUserByID_QNAME = new QName("http://pdms.me.org/", "getUserByID");
    private final static QName _GetUserType_QNAME = new QName("http://pdms.me.org/", "getUserType");
    private final static QName _ChangePasswordResponse_QNAME = new QName("http://pdms.me.org/", "changePasswordResponse");
    private final static QName _CreateElection_QNAME = new QName("http://pdms.me.org/", "createElection");
    private final static QName _GetAllUsers_QNAME = new QName("http://pdms.me.org/", "getAllUsers");
    private final static QName _GetUserResponse_QNAME = new QName("http://pdms.me.org/", "getUserResponse");
    private final static QName _GetUser_QNAME = new QName("http://pdms.me.org/", "getUser");
    private final static QName _GetUserNameResponse_QNAME = new QName("http://pdms.me.org/", "getUserNameResponse");
    private final static QName _GetAllCandidatesResponse_QNAME = new QName("http://pdms.me.org/", "getAllCandidatesResponse");
    private final static QName _ChangePassword_QNAME = new QName("http://pdms.me.org/", "changePassword");
    private final static QName _GetAllVotersResponse_QNAME = new QName("http://pdms.me.org/", "getAllVotersResponse");
    private final static QName _LogIn_QNAME = new QName("http://pdms.me.org/", "logIn");
    private final static QName _GetAllUsersResponse_QNAME = new QName("http://pdms.me.org/", "getAllUsersResponse");
    private final static QName _CreateElectionResponse_QNAME = new QName("http://pdms.me.org/", "createElectionResponse");
    private final static QName _LogInResponse_QNAME = new QName("http://pdms.me.org/", "logInResponse");
    private final static QName _GetUserByIDResponse_QNAME = new QName("http://pdms.me.org/", "getUserByIDResponse");
    private final static QName _GetUserName_QNAME = new QName("http://pdms.me.org/", "getUserName");
    private final static QName _GetAllVoters_QNAME = new QName("http://pdms.me.org/", "getAllVoters");
    private final static QName _RegisterUser_QNAME = new QName("http://pdms.me.org/", "registerUser");
    private final static QName _GetAllCandidates_QNAME = new QName("http://pdms.me.org/", "getAllCandidates");
    private final static QName _GetUserTypeResponse_QNAME = new QName("http://pdms.me.org/", "getUserTypeResponse");
    private final static QName _RegisterUserResponse_QNAME = new QName("http://pdms.me.org/", "registerUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.me.pdms
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllUsers }
     * 
     */
    public GetAllUsers createGetAllUsers() {
        return new GetAllUsers();
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link ChangePasswordResponse }
     * 
     */
    public ChangePasswordResponse createChangePasswordResponse() {
        return new ChangePasswordResponse();
    }

    /**
     * Create an instance of {@link CreateElection }
     * 
     */
    public CreateElection createCreateElection() {
        return new CreateElection();
    }

    /**
     * Create an instance of {@link GetUserByID }
     * 
     */
    public GetUserByID createGetUserByID() {
        return new GetUserByID();
    }

    /**
     * Create an instance of {@link GetUserType }
     * 
     */
    public GetUserType createGetUserType() {
        return new GetUserType();
    }

    /**
     * Create an instance of {@link GetUserNameResponse }
     * 
     */
    public GetUserNameResponse createGetUserNameResponse() {
        return new GetUserNameResponse();
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link GetAllCandidatesResponse }
     * 
     */
    public GetAllCandidatesResponse createGetAllCandidatesResponse() {
        return new GetAllCandidatesResponse();
    }

    /**
     * Create an instance of {@link LogIn }
     * 
     */
    public LogIn createLogIn() {
        return new LogIn();
    }

    /**
     * Create an instance of {@link GetAllVotersResponse }
     * 
     */
    public GetAllVotersResponse createGetAllVotersResponse() {
        return new GetAllVotersResponse();
    }

    /**
     * Create an instance of {@link ChangePassword }
     * 
     */
    public ChangePassword createChangePassword() {
        return new ChangePassword();
    }

    /**
     * Create an instance of {@link CreateElectionResponse }
     * 
     */
    public CreateElectionResponse createCreateElectionResponse() {
        return new CreateElectionResponse();
    }

    /**
     * Create an instance of {@link LogInResponse }
     * 
     */
    public LogInResponse createLogInResponse() {
        return new LogInResponse();
    }

    /**
     * Create an instance of {@link GetAllUsersResponse }
     * 
     */
    public GetAllUsersResponse createGetAllUsersResponse() {
        return new GetAllUsersResponse();
    }

    /**
     * Create an instance of {@link GetUserByIDResponse }
     * 
     */
    public GetUserByIDResponse createGetUserByIDResponse() {
        return new GetUserByIDResponse();
    }

    /**
     * Create an instance of {@link GetAllVoters }
     * 
     */
    public GetAllVoters createGetAllVoters() {
        return new GetAllVoters();
    }

    /**
     * Create an instance of {@link RegisterUser }
     * 
     */
    public RegisterUser createRegisterUser() {
        return new RegisterUser();
    }

    /**
     * Create an instance of {@link GetUserName }
     * 
     */
    public GetUserName createGetUserName() {
        return new GetUserName();
    }

    /**
     * Create an instance of {@link GetAllCandidates }
     * 
     */
    public GetAllCandidates createGetAllCandidates() {
        return new GetAllCandidates();
    }

    /**
     * Create an instance of {@link GetUserTypeResponse }
     * 
     */
    public GetUserTypeResponse createGetUserTypeResponse() {
        return new GetUserTypeResponse();
    }

    /**
     * Create an instance of {@link RegisterUserResponse }
     * 
     */
    public RegisterUserResponse createRegisterUserResponse() {
        return new RegisterUserResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getUserByID")
    public JAXBElement<GetUserByID> createGetUserByID(GetUserByID value) {
        return new JAXBElement<GetUserByID>(_GetUserByID_QNAME, GetUserByID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getUserType")
    public JAXBElement<GetUserType> createGetUserType(GetUserType value) {
        return new JAXBElement<GetUserType>(_GetUserType_QNAME, GetUserType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "changePasswordResponse")
    public JAXBElement<ChangePasswordResponse> createChangePasswordResponse(ChangePasswordResponse value) {
        return new JAXBElement<ChangePasswordResponse>(_ChangePasswordResponse_QNAME, ChangePasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateElection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "createElection")
    public JAXBElement<CreateElection> createCreateElection(CreateElection value) {
        return new JAXBElement<CreateElection>(_CreateElection_QNAME, CreateElection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getAllUsers")
    public JAXBElement<GetAllUsers> createGetAllUsers(GetAllUsers value) {
        return new JAXBElement<GetAllUsers>(_GetAllUsers_QNAME, GetAllUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getUserResponse")
    public JAXBElement<GetUserResponse> createGetUserResponse(GetUserResponse value) {
        return new JAXBElement<GetUserResponse>(_GetUserResponse_QNAME, GetUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getUser")
    public JAXBElement<GetUser> createGetUser(GetUser value) {
        return new JAXBElement<GetUser>(_GetUser_QNAME, GetUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getUserNameResponse")
    public JAXBElement<GetUserNameResponse> createGetUserNameResponse(GetUserNameResponse value) {
        return new JAXBElement<GetUserNameResponse>(_GetUserNameResponse_QNAME, GetUserNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCandidatesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getAllCandidatesResponse")
    public JAXBElement<GetAllCandidatesResponse> createGetAllCandidatesResponse(GetAllCandidatesResponse value) {
        return new JAXBElement<GetAllCandidatesResponse>(_GetAllCandidatesResponse_QNAME, GetAllCandidatesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "changePassword")
    public JAXBElement<ChangePassword> createChangePassword(ChangePassword value) {
        return new JAXBElement<ChangePassword>(_ChangePassword_QNAME, ChangePassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllVotersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getAllVotersResponse")
    public JAXBElement<GetAllVotersResponse> createGetAllVotersResponse(GetAllVotersResponse value) {
        return new JAXBElement<GetAllVotersResponse>(_GetAllVotersResponse_QNAME, GetAllVotersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "logIn")
    public JAXBElement<LogIn> createLogIn(LogIn value) {
        return new JAXBElement<LogIn>(_LogIn_QNAME, LogIn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getAllUsersResponse")
    public JAXBElement<GetAllUsersResponse> createGetAllUsersResponse(GetAllUsersResponse value) {
        return new JAXBElement<GetAllUsersResponse>(_GetAllUsersResponse_QNAME, GetAllUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateElectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "createElectionResponse")
    public JAXBElement<CreateElectionResponse> createCreateElectionResponse(CreateElectionResponse value) {
        return new JAXBElement<CreateElectionResponse>(_CreateElectionResponse_QNAME, CreateElectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogInResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "logInResponse")
    public JAXBElement<LogInResponse> createLogInResponse(LogInResponse value) {
        return new JAXBElement<LogInResponse>(_LogInResponse_QNAME, LogInResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getUserByIDResponse")
    public JAXBElement<GetUserByIDResponse> createGetUserByIDResponse(GetUserByIDResponse value) {
        return new JAXBElement<GetUserByIDResponse>(_GetUserByIDResponse_QNAME, GetUserByIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getUserName")
    public JAXBElement<GetUserName> createGetUserName(GetUserName value) {
        return new JAXBElement<GetUserName>(_GetUserName_QNAME, GetUserName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllVoters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getAllVoters")
    public JAXBElement<GetAllVoters> createGetAllVoters(GetAllVoters value) {
        return new JAXBElement<GetAllVoters>(_GetAllVoters_QNAME, GetAllVoters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "registerUser")
    public JAXBElement<RegisterUser> createRegisterUser(RegisterUser value) {
        return new JAXBElement<RegisterUser>(_RegisterUser_QNAME, RegisterUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCandidates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getAllCandidates")
    public JAXBElement<GetAllCandidates> createGetAllCandidates(GetAllCandidates value) {
        return new JAXBElement<GetAllCandidates>(_GetAllCandidates_QNAME, GetAllCandidates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getUserTypeResponse")
    public JAXBElement<GetUserTypeResponse> createGetUserTypeResponse(GetUserTypeResponse value) {
        return new JAXBElement<GetUserTypeResponse>(_GetUserTypeResponse_QNAME, GetUserTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "registerUserResponse")
    public JAXBElement<RegisterUserResponse> createRegisterUserResponse(RegisterUserResponse value) {
        return new JAXBElement<RegisterUserResponse>(_RegisterUserResponse_QNAME, RegisterUserResponse.class, null, value);
    }

}
