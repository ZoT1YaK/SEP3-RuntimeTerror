namespace Shared.DTOs;

public class UserCreationDTO
{
    public string userName { get; set; } = string.Empty;
    public string password { get; set; } = string.Empty;
    public string FirstName { get; set; } = string.Empty;
    public string LastName { get; set; } = string.Empty;
    public int Credits { get; set; }
    public string type { get; set; } = string.Empty;

    /*public UserCreationDTO(string userName, string password, string firstName, string lastName, int credits, string type)
    {
        this.userName = userName;
        this.password = password;
        FirstName = firstName;
        LastName = lastName;
        Credits = credits;
        this.type = type;
    }

    public UserCreationDTO() { }*/
    
}