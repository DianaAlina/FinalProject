
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

    private final static QName _GetAllUsers_QNAME = new QName("http://pdms.me.org/", "getAllUsers");
    private final static QName _AssignSiteManagerResponse_QNAME = new QName("http://pdms.me.org/", "assignSiteManagerResponse");
    private final static QName _AssignWorker_QNAME = new QName("http://pdms.me.org/", "assignWorker");
    private final static QName _GetStageResponse_QNAME = new QName("http://pdms.me.org/", "getStageResponse");
    private final static QName _GetAllStages_QNAME = new QName("http://pdms.me.org/", "getAllStages");
    private final static QName _LogIn_QNAME = new QName("http://pdms.me.org/", "logIn");
    private final static QName _CreateService_QNAME = new QName("http://pdms.me.org/", "createService");
    private final static QName _GetAllSuppliers_QNAME = new QName("http://pdms.me.org/", "getAllSuppliers");
    private final static QName _GetServicesOfWorker_QNAME = new QName("http://pdms.me.org/", "getServicesOfWorker");
    private final static QName _CreateMessage_QNAME = new QName("http://pdms.me.org/", "createMessage");
    private final static QName _RegisterUser_QNAME = new QName("http://pdms.me.org/", "registerUser");
    private final static QName _GetAllServices_QNAME = new QName("http://pdms.me.org/", "getAllServices");
    private final static QName _CreateOrder_QNAME = new QName("http://pdms.me.org/", "createOrder");
    private final static QName _SetCost_QNAME = new QName("http://pdms.me.org/", "setCost");
    private final static QName _FinishStage_QNAME = new QName("http://pdms.me.org/", "finishStage");
    private final static QName _CreateStage_QNAME = new QName("http://pdms.me.org/", "createStage");
    private final static QName _GetOrdersBySupplier_QNAME = new QName("http://pdms.me.org/", "getOrdersBySupplier");
    private final static QName _GetAllNotifications_QNAME = new QName("http://pdms.me.org/", "getAllNotifications");
    private final static QName _GetAllOrdersResponse_QNAME = new QName("http://pdms.me.org/", "getAllOrdersResponse");
    private final static QName _GetAllOrders_QNAME = new QName("http://pdms.me.org/", "getAllOrders");
    private final static QName _CreateStageResponse_QNAME = new QName("http://pdms.me.org/", "createStageResponse");
    private final static QName _GetServiceResponse_QNAME = new QName("http://pdms.me.org/", "getServiceResponse");
    private final static QName _GetOrdersByStageResponse_QNAME = new QName("http://pdms.me.org/", "getOrdersByStageResponse");
    private final static QName _DeliverOrderResponse_QNAME = new QName("http://pdms.me.org/", "deliverOrderResponse");
    private final static QName _GetNotificationsOfUser_QNAME = new QName("http://pdms.me.org/", "getNotificationsOfUser");
    private final static QName _CreateServiceResponse_QNAME = new QName("http://pdms.me.org/", "createServiceResponse");
    private final static QName _SetCostResponse_QNAME = new QName("http://pdms.me.org/", "setCostResponse");
    private final static QName _GetUserByID_QNAME = new QName("http://pdms.me.org/", "getUserByID");
    private final static QName _GetStage_QNAME = new QName("http://pdms.me.org/", "getStage");
    private final static QName _CreateMessageResponse_QNAME = new QName("http://pdms.me.org/", "createMessageResponse");
    private final static QName _CreateOrderResponse_QNAME = new QName("http://pdms.me.org/", "createOrderResponse");
    private final static QName _GetAllSiteManagers_QNAME = new QName("http://pdms.me.org/", "getAllSiteManagers");
    private final static QName _GetNotificationsOfUserResponse_QNAME = new QName("http://pdms.me.org/", "getNotificationsOfUserResponse");
    private final static QName _GetAllNotificationsResponse_QNAME = new QName("http://pdms.me.org/", "getAllNotificationsResponse");
    private final static QName _GetServicesOfUser_QNAME = new QName("http://pdms.me.org/", "getServicesOfUser");
    private final static QName _AssignSiteManager_QNAME = new QName("http://pdms.me.org/", "assignSiteManager");
    private final static QName _ChangePassword_QNAME = new QName("http://pdms.me.org/", "changePassword");
    private final static QName _GetAllStagesResponse_QNAME = new QName("http://pdms.me.org/", "getAllStagesResponse");
    private final static QName _GetService_QNAME = new QName("http://pdms.me.org/", "getService");
    private final static QName _GetAllSuppliersResponse_QNAME = new QName("http://pdms.me.org/", "getAllSuppliersResponse");
    private final static QName _GetServicesOfSiteManager_QNAME = new QName("http://pdms.me.org/", "getServicesOfSiteManager");
    private final static QName _GetAllUsersResponse_QNAME = new QName("http://pdms.me.org/", "getAllUsersResponse");
    private final static QName _GetAllMessages_QNAME = new QName("http://pdms.me.org/", "getAllMessages");
    private final static QName _GetMessagesOfStage_QNAME = new QName("http://pdms.me.org/", "getMessagesOfStage");
    private final static QName _GetOrder_QNAME = new QName("http://pdms.me.org/", "getOrder");
    private final static QName _GetUserByIDResponse_QNAME = new QName("http://pdms.me.org/", "getUserByIDResponse");
    private final static QName _FinishStageResponse_QNAME = new QName("http://pdms.me.org/", "finishStageResponse");
    private final static QName _ChangePasswordResponse_QNAME = new QName("http://pdms.me.org/", "changePasswordResponse");
    private final static QName _GetAllWorkersResponse_QNAME = new QName("http://pdms.me.org/", "getAllWorkersResponse");
    private final static QName _GetUserResponse_QNAME = new QName("http://pdms.me.org/", "getUserResponse");
    private final static QName _AssignWorkerResponse_QNAME = new QName("http://pdms.me.org/", "assignWorkerResponse");
    private final static QName _DiscardNotificationResponse_QNAME = new QName("http://pdms.me.org/", "discardNotificationResponse");
    private final static QName _GetOrdersBySupplierResponse_QNAME = new QName("http://pdms.me.org/", "getOrdersBySupplierResponse");
    private final static QName _GetUser_QNAME = new QName("http://pdms.me.org/", "getUser");
    private final static QName _GetAllMessagesResponse_QNAME = new QName("http://pdms.me.org/", "getAllMessagesResponse");
    private final static QName _GetAllServicesResponse_QNAME = new QName("http://pdms.me.org/", "getAllServicesResponse");
    private final static QName _DeliverOrder_QNAME = new QName("http://pdms.me.org/", "deliverOrder");
    private final static QName _GetMessagesOfStageResponse_QNAME = new QName("http://pdms.me.org/", "getMessagesOfStageResponse");
    private final static QName _GetServicesOfUserResponse_QNAME = new QName("http://pdms.me.org/", "getServicesOfUserResponse");
    private final static QName _LogInResponse_QNAME = new QName("http://pdms.me.org/", "logInResponse");
    private final static QName _GetUnseenNotificationsOfUser_QNAME = new QName("http://pdms.me.org/", "getUnseenNotificationsOfUser");
    private final static QName _GetOrdersByStage_QNAME = new QName("http://pdms.me.org/", "getOrdersByStage");
    private final static QName _GetServicesOfSiteManagerResponse_QNAME = new QName("http://pdms.me.org/", "getServicesOfSiteManagerResponse");
    private final static QName _GetAllWorkers_QNAME = new QName("http://pdms.me.org/", "getAllWorkers");
    private final static QName _GetUnseenNotificationsOfUserResponse_QNAME = new QName("http://pdms.me.org/", "getUnseenNotificationsOfUserResponse");
    private final static QName _DiscardNotification_QNAME = new QName("http://pdms.me.org/", "discardNotification");
    private final static QName _RegisterUserResponse_QNAME = new QName("http://pdms.me.org/", "registerUserResponse");
    private final static QName _GetAllSiteManagersResponse_QNAME = new QName("http://pdms.me.org/", "getAllSiteManagersResponse");
    private final static QName _GetServicesOfWorkerResponse_QNAME = new QName("http://pdms.me.org/", "getServicesOfWorkerResponse");
    private final static QName _GetOrderResponse_QNAME = new QName("http://pdms.me.org/", "getOrderResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.me.pdms
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateOrder }
     * 
     */
    public CreateOrder createCreateOrder() {
        return new CreateOrder();
    }

    /**
     * Create an instance of {@link GetAllServices }
     * 
     */
    public GetAllServices createGetAllServices() {
        return new GetAllServices();
    }

    /**
     * Create an instance of {@link FinishStage }
     * 
     */
    public FinishStage createFinishStage() {
        return new FinishStage();
    }

    /**
     * Create an instance of {@link SetCost }
     * 
     */
    public SetCost createSetCost() {
        return new SetCost();
    }

    /**
     * Create an instance of {@link GetAllNotifications }
     * 
     */
    public GetAllNotifications createGetAllNotifications() {
        return new GetAllNotifications();
    }

    /**
     * Create an instance of {@link GetAllOrdersResponse }
     * 
     */
    public GetAllOrdersResponse createGetAllOrdersResponse() {
        return new GetAllOrdersResponse();
    }

    /**
     * Create an instance of {@link CreateStage }
     * 
     */
    public CreateStage createCreateStage() {
        return new CreateStage();
    }

    /**
     * Create an instance of {@link GetOrdersBySupplier }
     * 
     */
    public GetOrdersBySupplier createGetOrdersBySupplier() {
        return new GetOrdersBySupplier();
    }

    /**
     * Create an instance of {@link GetAllOrders }
     * 
     */
    public GetAllOrders createGetAllOrders() {
        return new GetAllOrders();
    }

    /**
     * Create an instance of {@link GetOrdersByStageResponse }
     * 
     */
    public GetOrdersByStageResponse createGetOrdersByStageResponse() {
        return new GetOrdersByStageResponse();
    }

    /**
     * Create an instance of {@link CreateStageResponse }
     * 
     */
    public CreateStageResponse createCreateStageResponse() {
        return new CreateStageResponse();
    }

    /**
     * Create an instance of {@link GetServiceResponse }
     * 
     */
    public GetServiceResponse createGetServiceResponse() {
        return new GetServiceResponse();
    }

    /**
     * Create an instance of {@link GetNotificationsOfUser }
     * 
     */
    public GetNotificationsOfUser createGetNotificationsOfUser() {
        return new GetNotificationsOfUser();
    }

    /**
     * Create an instance of {@link DeliverOrderResponse }
     * 
     */
    public DeliverOrderResponse createDeliverOrderResponse() {
        return new DeliverOrderResponse();
    }

    /**
     * Create an instance of {@link SetCostResponse }
     * 
     */
    public SetCostResponse createSetCostResponse() {
        return new SetCostResponse();
    }

    /**
     * Create an instance of {@link CreateServiceResponse }
     * 
     */
    public CreateServiceResponse createCreateServiceResponse() {
        return new CreateServiceResponse();
    }

    /**
     * Create an instance of {@link GetAllUsers }
     * 
     */
    public GetAllUsers createGetAllUsers() {
        return new GetAllUsers();
    }

    /**
     * Create an instance of {@link AssignSiteManagerResponse }
     * 
     */
    public AssignSiteManagerResponse createAssignSiteManagerResponse() {
        return new AssignSiteManagerResponse();
    }

    /**
     * Create an instance of {@link AssignWorker }
     * 
     */
    public AssignWorker createAssignWorker() {
        return new AssignWorker();
    }

    /**
     * Create an instance of {@link GetStageResponse }
     * 
     */
    public GetStageResponse createGetStageResponse() {
        return new GetStageResponse();
    }

    /**
     * Create an instance of {@link LogIn }
     * 
     */
    public LogIn createLogIn() {
        return new LogIn();
    }

    /**
     * Create an instance of {@link GetAllStages }
     * 
     */
    public GetAllStages createGetAllStages() {
        return new GetAllStages();
    }

    /**
     * Create an instance of {@link GetAllSuppliers }
     * 
     */
    public GetAllSuppliers createGetAllSuppliers() {
        return new GetAllSuppliers();
    }

    /**
     * Create an instance of {@link CreateService }
     * 
     */
    public CreateService createCreateService() {
        return new CreateService();
    }

    /**
     * Create an instance of {@link GetServicesOfWorker }
     * 
     */
    public GetServicesOfWorker createGetServicesOfWorker() {
        return new GetServicesOfWorker();
    }

    /**
     * Create an instance of {@link RegisterUser }
     * 
     */
    public RegisterUser createRegisterUser() {
        return new RegisterUser();
    }

    /**
     * Create an instance of {@link CreateMessage }
     * 
     */
    public CreateMessage createCreateMessage() {
        return new CreateMessage();
    }

    /**
     * Create an instance of {@link AssignWorkerResponse }
     * 
     */
    public AssignWorkerResponse createAssignWorkerResponse() {
        return new AssignWorkerResponse();
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
     * Create an instance of {@link GetAllWorkersResponse }
     * 
     */
    public GetAllWorkersResponse createGetAllWorkersResponse() {
        return new GetAllWorkersResponse();
    }

    /**
     * Create an instance of {@link GetAllServicesResponse }
     * 
     */
    public GetAllServicesResponse createGetAllServicesResponse() {
        return new GetAllServicesResponse();
    }

    /**
     * Create an instance of {@link GetAllMessagesResponse }
     * 
     */
    public GetAllMessagesResponse createGetAllMessagesResponse() {
        return new GetAllMessagesResponse();
    }

    /**
     * Create an instance of {@link DiscardNotificationResponse }
     * 
     */
    public DiscardNotificationResponse createDiscardNotificationResponse() {
        return new DiscardNotificationResponse();
    }

    /**
     * Create an instance of {@link GetOrdersBySupplierResponse }
     * 
     */
    public GetOrdersBySupplierResponse createGetOrdersBySupplierResponse() {
        return new GetOrdersBySupplierResponse();
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link DeliverOrder }
     * 
     */
    public DeliverOrder createDeliverOrder() {
        return new DeliverOrder();
    }

    /**
     * Create an instance of {@link GetMessagesOfStageResponse }
     * 
     */
    public GetMessagesOfStageResponse createGetMessagesOfStageResponse() {
        return new GetMessagesOfStageResponse();
    }

    /**
     * Create an instance of {@link GetServicesOfUserResponse }
     * 
     */
    public GetServicesOfUserResponse createGetServicesOfUserResponse() {
        return new GetServicesOfUserResponse();
    }

    /**
     * Create an instance of {@link LogInResponse }
     * 
     */
    public LogInResponse createLogInResponse() {
        return new LogInResponse();
    }

    /**
     * Create an instance of {@link GetOrdersByStage }
     * 
     */
    public GetOrdersByStage createGetOrdersByStage() {
        return new GetOrdersByStage();
    }

    /**
     * Create an instance of {@link GetUnseenNotificationsOfUser }
     * 
     */
    public GetUnseenNotificationsOfUser createGetUnseenNotificationsOfUser() {
        return new GetUnseenNotificationsOfUser();
    }

    /**
     * Create an instance of {@link GetUnseenNotificationsOfUserResponse }
     * 
     */
    public GetUnseenNotificationsOfUserResponse createGetUnseenNotificationsOfUserResponse() {
        return new GetUnseenNotificationsOfUserResponse();
    }

    /**
     * Create an instance of {@link GetAllWorkers }
     * 
     */
    public GetAllWorkers createGetAllWorkers() {
        return new GetAllWorkers();
    }

    /**
     * Create an instance of {@link GetServicesOfSiteManagerResponse }
     * 
     */
    public GetServicesOfSiteManagerResponse createGetServicesOfSiteManagerResponse() {
        return new GetServicesOfSiteManagerResponse();
    }

    /**
     * Create an instance of {@link GetOrderResponse }
     * 
     */
    public GetOrderResponse createGetOrderResponse() {
        return new GetOrderResponse();
    }

    /**
     * Create an instance of {@link GetAllSiteManagersResponse }
     * 
     */
    public GetAllSiteManagersResponse createGetAllSiteManagersResponse() {
        return new GetAllSiteManagersResponse();
    }

    /**
     * Create an instance of {@link GetServicesOfWorkerResponse }
     * 
     */
    public GetServicesOfWorkerResponse createGetServicesOfWorkerResponse() {
        return new GetServicesOfWorkerResponse();
    }

    /**
     * Create an instance of {@link RegisterUserResponse }
     * 
     */
    public RegisterUserResponse createRegisterUserResponse() {
        return new RegisterUserResponse();
    }

    /**
     * Create an instance of {@link DiscardNotification }
     * 
     */
    public DiscardNotification createDiscardNotification() {
        return new DiscardNotification();
    }

    /**
     * Create an instance of {@link GetStage }
     * 
     */
    public GetStage createGetStage() {
        return new GetStage();
    }

    /**
     * Create an instance of {@link GetUserByID }
     * 
     */
    public GetUserByID createGetUserByID() {
        return new GetUserByID();
    }

    /**
     * Create an instance of {@link GetNotificationsOfUserResponse }
     * 
     */
    public GetNotificationsOfUserResponse createGetNotificationsOfUserResponse() {
        return new GetNotificationsOfUserResponse();
    }

    /**
     * Create an instance of {@link GetAllSiteManagers }
     * 
     */
    public GetAllSiteManagers createGetAllSiteManagers() {
        return new GetAllSiteManagers();
    }

    /**
     * Create an instance of {@link CreateOrderResponse }
     * 
     */
    public CreateOrderResponse createCreateOrderResponse() {
        return new CreateOrderResponse();
    }

    /**
     * Create an instance of {@link CreateMessageResponse }
     * 
     */
    public CreateMessageResponse createCreateMessageResponse() {
        return new CreateMessageResponse();
    }

    /**
     * Create an instance of {@link GetServicesOfUser }
     * 
     */
    public GetServicesOfUser createGetServicesOfUser() {
        return new GetServicesOfUser();
    }

    /**
     * Create an instance of {@link GetAllNotificationsResponse }
     * 
     */
    public GetAllNotificationsResponse createGetAllNotificationsResponse() {
        return new GetAllNotificationsResponse();
    }

    /**
     * Create an instance of {@link GetServicesOfSiteManager }
     * 
     */
    public GetServicesOfSiteManager createGetServicesOfSiteManager() {
        return new GetServicesOfSiteManager();
    }

    /**
     * Create an instance of {@link GetAllSuppliersResponse }
     * 
     */
    public GetAllSuppliersResponse createGetAllSuppliersResponse() {
        return new GetAllSuppliersResponse();
    }

    /**
     * Create an instance of {@link GetAllStagesResponse }
     * 
     */
    public GetAllStagesResponse createGetAllStagesResponse() {
        return new GetAllStagesResponse();
    }

    /**
     * Create an instance of {@link GetService }
     * 
     */
    public GetService createGetService() {
        return new GetService();
    }

    /**
     * Create an instance of {@link AssignSiteManager }
     * 
     */
    public AssignSiteManager createAssignSiteManager() {
        return new AssignSiteManager();
    }

    /**
     * Create an instance of {@link ChangePassword }
     * 
     */
    public ChangePassword createChangePassword() {
        return new ChangePassword();
    }

    /**
     * Create an instance of {@link GetAllMessages }
     * 
     */
    public GetAllMessages createGetAllMessages() {
        return new GetAllMessages();
    }

    /**
     * Create an instance of {@link GetMessagesOfStage }
     * 
     */
    public GetMessagesOfStage createGetMessagesOfStage() {
        return new GetMessagesOfStage();
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
     * Create an instance of {@link GetOrder }
     * 
     */
    public GetOrder createGetOrder() {
        return new GetOrder();
    }

    /**
     * Create an instance of {@link FinishStageResponse }
     * 
     */
    public FinishStageResponse createFinishStageResponse() {
        return new FinishStageResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignSiteManagerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "assignSiteManagerResponse")
    public JAXBElement<AssignSiteManagerResponse> createAssignSiteManagerResponse(AssignSiteManagerResponse value) {
        return new JAXBElement<AssignSiteManagerResponse>(_AssignSiteManagerResponse_QNAME, AssignSiteManagerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignWorker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "assignWorker")
    public JAXBElement<AssignWorker> createAssignWorker(AssignWorker value) {
        return new JAXBElement<AssignWorker>(_AssignWorker_QNAME, AssignWorker.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getStageResponse")
    public JAXBElement<GetStageResponse> createGetStageResponse(GetStageResponse value) {
        return new JAXBElement<GetStageResponse>(_GetStageResponse_QNAME, GetStageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllStages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getAllStages")
    public JAXBElement<GetAllStages> createGetAllStages(GetAllStages value) {
        return new JAXBElement<GetAllStages>(_GetAllStages_QNAME, GetAllStages.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "createService")
    public JAXBElement<CreateService> createCreateService(CreateService value) {
        return new JAXBElement<CreateService>(_CreateService_QNAME, CreateService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSuppliers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getAllSuppliers")
    public JAXBElement<GetAllSuppliers> createGetAllSuppliers(GetAllSuppliers value) {
        return new JAXBElement<GetAllSuppliers>(_GetAllSuppliers_QNAME, GetAllSuppliers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServicesOfWorker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getServicesOfWorker")
    public JAXBElement<GetServicesOfWorker> createGetServicesOfWorker(GetServicesOfWorker value) {
        return new JAXBElement<GetServicesOfWorker>(_GetServicesOfWorker_QNAME, GetServicesOfWorker.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "createMessage")
    public JAXBElement<CreateMessage> createCreateMessage(CreateMessage value) {
        return new JAXBElement<CreateMessage>(_CreateMessage_QNAME, CreateMessage.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllServices }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getAllServices")
    public JAXBElement<GetAllServices> createGetAllServices(GetAllServices value) {
        return new JAXBElement<GetAllServices>(_GetAllServices_QNAME, GetAllServices.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "createOrder")
    public JAXBElement<CreateOrder> createCreateOrder(CreateOrder value) {
        return new JAXBElement<CreateOrder>(_CreateOrder_QNAME, CreateOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "setCost")
    public JAXBElement<SetCost> createSetCost(SetCost value) {
        return new JAXBElement<SetCost>(_SetCost_QNAME, SetCost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinishStage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "finishStage")
    public JAXBElement<FinishStage> createFinishStage(FinishStage value) {
        return new JAXBElement<FinishStage>(_FinishStage_QNAME, FinishStage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "createStage")
    public JAXBElement<CreateStage> createCreateStage(CreateStage value) {
        return new JAXBElement<CreateStage>(_CreateStage_QNAME, CreateStage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersBySupplier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getOrdersBySupplier")
    public JAXBElement<GetOrdersBySupplier> createGetOrdersBySupplier(GetOrdersBySupplier value) {
        return new JAXBElement<GetOrdersBySupplier>(_GetOrdersBySupplier_QNAME, GetOrdersBySupplier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllNotifications }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getAllNotifications")
    public JAXBElement<GetAllNotifications> createGetAllNotifications(GetAllNotifications value) {
        return new JAXBElement<GetAllNotifications>(_GetAllNotifications_QNAME, GetAllNotifications.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getAllOrdersResponse")
    public JAXBElement<GetAllOrdersResponse> createGetAllOrdersResponse(GetAllOrdersResponse value) {
        return new JAXBElement<GetAllOrdersResponse>(_GetAllOrdersResponse_QNAME, GetAllOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllOrders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getAllOrders")
    public JAXBElement<GetAllOrders> createGetAllOrders(GetAllOrders value) {
        return new JAXBElement<GetAllOrders>(_GetAllOrders_QNAME, GetAllOrders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateStageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "createStageResponse")
    public JAXBElement<CreateStageResponse> createCreateStageResponse(CreateStageResponse value) {
        return new JAXBElement<CreateStageResponse>(_CreateStageResponse_QNAME, CreateStageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getServiceResponse")
    public JAXBElement<GetServiceResponse> createGetServiceResponse(GetServiceResponse value) {
        return new JAXBElement<GetServiceResponse>(_GetServiceResponse_QNAME, GetServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersByStageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getOrdersByStageResponse")
    public JAXBElement<GetOrdersByStageResponse> createGetOrdersByStageResponse(GetOrdersByStageResponse value) {
        return new JAXBElement<GetOrdersByStageResponse>(_GetOrdersByStageResponse_QNAME, GetOrdersByStageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliverOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "deliverOrderResponse")
    public JAXBElement<DeliverOrderResponse> createDeliverOrderResponse(DeliverOrderResponse value) {
        return new JAXBElement<DeliverOrderResponse>(_DeliverOrderResponse_QNAME, DeliverOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNotificationsOfUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getNotificationsOfUser")
    public JAXBElement<GetNotificationsOfUser> createGetNotificationsOfUser(GetNotificationsOfUser value) {
        return new JAXBElement<GetNotificationsOfUser>(_GetNotificationsOfUser_QNAME, GetNotificationsOfUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "createServiceResponse")
    public JAXBElement<CreateServiceResponse> createCreateServiceResponse(CreateServiceResponse value) {
        return new JAXBElement<CreateServiceResponse>(_CreateServiceResponse_QNAME, CreateServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCostResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "setCostResponse")
    public JAXBElement<SetCostResponse> createSetCostResponse(SetCostResponse value) {
        return new JAXBElement<SetCostResponse>(_SetCostResponse_QNAME, SetCostResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getStage")
    public JAXBElement<GetStage> createGetStage(GetStage value) {
        return new JAXBElement<GetStage>(_GetStage_QNAME, GetStage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "createMessageResponse")
    public JAXBElement<CreateMessageResponse> createCreateMessageResponse(CreateMessageResponse value) {
        return new JAXBElement<CreateMessageResponse>(_CreateMessageResponse_QNAME, CreateMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "createOrderResponse")
    public JAXBElement<CreateOrderResponse> createCreateOrderResponse(CreateOrderResponse value) {
        return new JAXBElement<CreateOrderResponse>(_CreateOrderResponse_QNAME, CreateOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSiteManagers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getAllSiteManagers")
    public JAXBElement<GetAllSiteManagers> createGetAllSiteManagers(GetAllSiteManagers value) {
        return new JAXBElement<GetAllSiteManagers>(_GetAllSiteManagers_QNAME, GetAllSiteManagers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNotificationsOfUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getNotificationsOfUserResponse")
    public JAXBElement<GetNotificationsOfUserResponse> createGetNotificationsOfUserResponse(GetNotificationsOfUserResponse value) {
        return new JAXBElement<GetNotificationsOfUserResponse>(_GetNotificationsOfUserResponse_QNAME, GetNotificationsOfUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllNotificationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getAllNotificationsResponse")
    public JAXBElement<GetAllNotificationsResponse> createGetAllNotificationsResponse(GetAllNotificationsResponse value) {
        return new JAXBElement<GetAllNotificationsResponse>(_GetAllNotificationsResponse_QNAME, GetAllNotificationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServicesOfUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getServicesOfUser")
    public JAXBElement<GetServicesOfUser> createGetServicesOfUser(GetServicesOfUser value) {
        return new JAXBElement<GetServicesOfUser>(_GetServicesOfUser_QNAME, GetServicesOfUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignSiteManager }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "assignSiteManager")
    public JAXBElement<AssignSiteManager> createAssignSiteManager(AssignSiteManager value) {
        return new JAXBElement<AssignSiteManager>(_AssignSiteManager_QNAME, AssignSiteManager.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllStagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getAllStagesResponse")
    public JAXBElement<GetAllStagesResponse> createGetAllStagesResponse(GetAllStagesResponse value) {
        return new JAXBElement<GetAllStagesResponse>(_GetAllStagesResponse_QNAME, GetAllStagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getService")
    public JAXBElement<GetService> createGetService(GetService value) {
        return new JAXBElement<GetService>(_GetService_QNAME, GetService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSuppliersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getAllSuppliersResponse")
    public JAXBElement<GetAllSuppliersResponse> createGetAllSuppliersResponse(GetAllSuppliersResponse value) {
        return new JAXBElement<GetAllSuppliersResponse>(_GetAllSuppliersResponse_QNAME, GetAllSuppliersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServicesOfSiteManager }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getServicesOfSiteManager")
    public JAXBElement<GetServicesOfSiteManager> createGetServicesOfSiteManager(GetServicesOfSiteManager value) {
        return new JAXBElement<GetServicesOfSiteManager>(_GetServicesOfSiteManager_QNAME, GetServicesOfSiteManager.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMessages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getAllMessages")
    public JAXBElement<GetAllMessages> createGetAllMessages(GetAllMessages value) {
        return new JAXBElement<GetAllMessages>(_GetAllMessages_QNAME, GetAllMessages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessagesOfStage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getMessagesOfStage")
    public JAXBElement<GetMessagesOfStage> createGetMessagesOfStage(GetMessagesOfStage value) {
        return new JAXBElement<GetMessagesOfStage>(_GetMessagesOfStage_QNAME, GetMessagesOfStage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getOrder")
    public JAXBElement<GetOrder> createGetOrder(GetOrder value) {
        return new JAXBElement<GetOrder>(_GetOrder_QNAME, GetOrder.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FinishStageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "finishStageResponse")
    public JAXBElement<FinishStageResponse> createFinishStageResponse(FinishStageResponse value) {
        return new JAXBElement<FinishStageResponse>(_FinishStageResponse_QNAME, FinishStageResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllWorkersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getAllWorkersResponse")
    public JAXBElement<GetAllWorkersResponse> createGetAllWorkersResponse(GetAllWorkersResponse value) {
        return new JAXBElement<GetAllWorkersResponse>(_GetAllWorkersResponse_QNAME, GetAllWorkersResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignWorkerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "assignWorkerResponse")
    public JAXBElement<AssignWorkerResponse> createAssignWorkerResponse(AssignWorkerResponse value) {
        return new JAXBElement<AssignWorkerResponse>(_AssignWorkerResponse_QNAME, AssignWorkerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscardNotificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "discardNotificationResponse")
    public JAXBElement<DiscardNotificationResponse> createDiscardNotificationResponse(DiscardNotificationResponse value) {
        return new JAXBElement<DiscardNotificationResponse>(_DiscardNotificationResponse_QNAME, DiscardNotificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersBySupplierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getOrdersBySupplierResponse")
    public JAXBElement<GetOrdersBySupplierResponse> createGetOrdersBySupplierResponse(GetOrdersBySupplierResponse value) {
        return new JAXBElement<GetOrdersBySupplierResponse>(_GetOrdersBySupplierResponse_QNAME, GetOrdersBySupplierResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMessagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getAllMessagesResponse")
    public JAXBElement<GetAllMessagesResponse> createGetAllMessagesResponse(GetAllMessagesResponse value) {
        return new JAXBElement<GetAllMessagesResponse>(_GetAllMessagesResponse_QNAME, GetAllMessagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllServicesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getAllServicesResponse")
    public JAXBElement<GetAllServicesResponse> createGetAllServicesResponse(GetAllServicesResponse value) {
        return new JAXBElement<GetAllServicesResponse>(_GetAllServicesResponse_QNAME, GetAllServicesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliverOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "deliverOrder")
    public JAXBElement<DeliverOrder> createDeliverOrder(DeliverOrder value) {
        return new JAXBElement<DeliverOrder>(_DeliverOrder_QNAME, DeliverOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessagesOfStageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getMessagesOfStageResponse")
    public JAXBElement<GetMessagesOfStageResponse> createGetMessagesOfStageResponse(GetMessagesOfStageResponse value) {
        return new JAXBElement<GetMessagesOfStageResponse>(_GetMessagesOfStageResponse_QNAME, GetMessagesOfStageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServicesOfUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getServicesOfUserResponse")
    public JAXBElement<GetServicesOfUserResponse> createGetServicesOfUserResponse(GetServicesOfUserResponse value) {
        return new JAXBElement<GetServicesOfUserResponse>(_GetServicesOfUserResponse_QNAME, GetServicesOfUserResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnseenNotificationsOfUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getUnseenNotificationsOfUser")
    public JAXBElement<GetUnseenNotificationsOfUser> createGetUnseenNotificationsOfUser(GetUnseenNotificationsOfUser value) {
        return new JAXBElement<GetUnseenNotificationsOfUser>(_GetUnseenNotificationsOfUser_QNAME, GetUnseenNotificationsOfUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersByStage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getOrdersByStage")
    public JAXBElement<GetOrdersByStage> createGetOrdersByStage(GetOrdersByStage value) {
        return new JAXBElement<GetOrdersByStage>(_GetOrdersByStage_QNAME, GetOrdersByStage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServicesOfSiteManagerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getServicesOfSiteManagerResponse")
    public JAXBElement<GetServicesOfSiteManagerResponse> createGetServicesOfSiteManagerResponse(GetServicesOfSiteManagerResponse value) {
        return new JAXBElement<GetServicesOfSiteManagerResponse>(_GetServicesOfSiteManagerResponse_QNAME, GetServicesOfSiteManagerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllWorkers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getAllWorkers")
    public JAXBElement<GetAllWorkers> createGetAllWorkers(GetAllWorkers value) {
        return new JAXBElement<GetAllWorkers>(_GetAllWorkers_QNAME, GetAllWorkers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnseenNotificationsOfUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getUnseenNotificationsOfUserResponse")
    public JAXBElement<GetUnseenNotificationsOfUserResponse> createGetUnseenNotificationsOfUserResponse(GetUnseenNotificationsOfUserResponse value) {
        return new JAXBElement<GetUnseenNotificationsOfUserResponse>(_GetUnseenNotificationsOfUserResponse_QNAME, GetUnseenNotificationsOfUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscardNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "discardNotification")
    public JAXBElement<DiscardNotification> createDiscardNotification(DiscardNotification value) {
        return new JAXBElement<DiscardNotification>(_DiscardNotification_QNAME, DiscardNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "registerUserResponse")
    public JAXBElement<RegisterUserResponse> createRegisterUserResponse(RegisterUserResponse value) {
        return new JAXBElement<RegisterUserResponse>(_RegisterUserResponse_QNAME, RegisterUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSiteManagersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getAllSiteManagersResponse")
    public JAXBElement<GetAllSiteManagersResponse> createGetAllSiteManagersResponse(GetAllSiteManagersResponse value) {
        return new JAXBElement<GetAllSiteManagersResponse>(_GetAllSiteManagersResponse_QNAME, GetAllSiteManagersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServicesOfWorkerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getServicesOfWorkerResponse")
    public JAXBElement<GetServicesOfWorkerResponse> createGetServicesOfWorkerResponse(GetServicesOfWorkerResponse value) {
        return new JAXBElement<GetServicesOfWorkerResponse>(_GetServicesOfWorkerResponse_QNAME, GetServicesOfWorkerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pdms.me.org/", name = "getOrderResponse")
    public JAXBElement<GetOrderResponse> createGetOrderResponse(GetOrderResponse value) {
        return new JAXBElement<GetOrderResponse>(_GetOrderResponse_QNAME, GetOrderResponse.class, null, value);
    }

}
