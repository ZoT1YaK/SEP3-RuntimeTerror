namespace Shared.DTOs;

public class UserCreationDTO
{
    public string userName { get; set; }
    public string password { get; set; }
    public string FirstName { get; set; }
    public string LastName { get; set; }
    public int Credits { get; set; }
    public string type { get; set; }

    public UserCreationDTO(string userName, string password, string firstName, string lastName, int credits, string type)
    {
        this.userName = userName;
        this.password = password;
        FirstName = firstName;
        LastName = lastName;
        Credits = credits;
        this.type = type;
    }

    public UserCreationDTO() { }
    
}