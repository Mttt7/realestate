export interface Property {
  id: number;
  author: any;
  name: string;
  price: number;
  description: string;
  country: string;
  city: string;
  street?: string;
  address?: string;
  estate: string;
  floor: number;
  floors: number;
  rooms: number;
  bathrooms: number;
  sizeMeters: number;
  parkingSpaces: number;

  favorite?: boolean;
}
